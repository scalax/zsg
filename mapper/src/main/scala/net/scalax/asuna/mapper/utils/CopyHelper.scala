package net.scalax.asuna.mapper.utils

import java.io.{File, InputStream}
import java.net.{JarURLConnection, URL}
import java.nio.file.{Files, Path, Paths}
import java.util.Date
import java.util.jar.JarFile

import scala.collection.JavaConverters._

object CopyHelper {

  def copyFromClassPath(paths: List[String], targetRoot: Path): Boolean = {
    Files.createDirectories(targetRoot)
    val classPathStr = paths.mkString("/")
    val sourURLs     = getClass.getClassLoader.getResources(classPathStr).asScala.toStream
    sourURLs.map { sourURL =>
      val date = new Date()
      sourURL match {
        case s: URL if "file" == s.getProtocol =>
          copyFilesFromDir(new File(sourURL.toURI).toPath, targetRoot)
        case s: URL if "jar" == s.getProtocol =>
          val jarFile = s.openConnection().asInstanceOf[JarURLConnection].getJarFile
          copyFilesFromJarFile(jarFile, classPathStr, targetRoot)
      }
      val waste = new Date().getTime - date.getTime
    }.toList
    true
  }

  def doCopyFile(input: InputStream, path: Path): Long = {
    Files.createDirectories(path.getParent)
    Files.copy(input, path)
  }

  def copyFilesFromDir(sourceRoot: Path, targetRoot: Path): Boolean = {
    Files.createDirectories(targetRoot)
    if (Files.isDirectory(sourceRoot) && Files.isDirectory(targetRoot)) {
      sourceRoot.toFile.listFiles.toList.map { eachFile =>
        val eachPath   = eachFile.toPath
        val targetPath = targetRoot.resolve(eachFile.getName)
        if (Files.isDirectory(eachPath)) {
          copyFilesFromDir(eachPath, targetPath)
        } else {
          Files.copy(eachPath, targetPath)
        }
      }
      true
    } else
      false
  }

  def copyFilesFromJarFile(jarFile: JarFile, prefix: String, targetRoot: Path) = {
    val entries      = jarFile.entries()
    val scalaEntries = entries.asScala.toStream
    scalaEntries
      .filter { s =>
        s.getName.startsWith(prefix) && (!s.isDirectory)
      }
      .map { entry =>
        var inputS: InputStream = null
        try {
          inputS = getClass.getClassLoader.getResourceAsStream(entry.getName)
          val entryPath = Paths.get(targetRoot.toFile.getCanonicalPath, entry.getName.drop(prefix.size))
          doCopyFile(inputS, entryPath)
        } finally {
          if (inputS ne null) {
            inputS.close()
          }
        }
      }
      .toList
  }

}
