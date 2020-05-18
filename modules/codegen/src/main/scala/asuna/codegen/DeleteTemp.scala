package zsg.codegen

import zsg.codegen.tuple.ZsgTupleCodeGeneration
import org.apache.commons.io.FileUtils

object DeleteTemp {
  def main(i: Array[String]): Unit = {
    FileUtils.deleteDirectory(ZsgTupleCodeGeneration.root1_all_Dir.toFile)
    FileUtils.deleteDirectory(ZsgTupleCodeGeneration.root1_2X_Dir.toFile)
    FileUtils.deleteDirectory(ZsgTupleCodeGeneration.root1_dotty_Dir.toFile)
    FileUtils.deleteDirectory(ZsgTupleCodeGeneration.root2Dir.toFile)
    FileUtils.deleteDirectory(ZsgTupleCodeGeneration.root3Dir.toFile)

    FileUtils.deleteDirectory(ZsgCoreCodeGeneration.root2XDir.toFile)
    FileUtils.deleteDirectory(ZsgCoreCodeGeneration.rootAllDir.toFile)
    FileUtils.deleteDirectory(ZsgCoreCodeGeneration.rootDottyDir.toFile)

    FileUtils.deleteDirectory(ZsgTestKitCodeGeneration.root2XDir.toFile)
  }
}
