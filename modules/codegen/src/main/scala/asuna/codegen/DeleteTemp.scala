package asuna.codegen

import asuna.codegen.tuple.AsunaTupleCodeGeneration
import org.apache.commons.io.FileUtils

object DeleteTemp {
  def main(i: Array[String]): Unit = {
    FileUtils.deleteDirectory(AsunaTupleCodeGeneration.rootDir.toFile)
    FileUtils.deleteDirectory(AsunaTupleCodeGeneration.root1Dir.toFile)
    FileUtils.deleteDirectory(AsunaTupleCodeGeneration.root2Dir.toFile)
    FileUtils.deleteDirectory(AsunaTupleCodeGeneration.root3Dir.toFile)
    FileUtils.deleteDirectory(AsunaCoreCodeGeneration.rootDir.toFile)
    FileUtils.deleteDirectory(AsunaTestKitCodeGeneration.rootDir.toFile)
  }
}
