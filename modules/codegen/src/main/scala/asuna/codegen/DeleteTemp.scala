package asuna.codegen

import asuna.codegen.tuple.AsunaTupleCodeGeneration
import org.apache.commons.io.FileUtils

object DeleteTemp {
  def main(i: Array[String]): Unit = {
    FileUtils.deleteDirectory(AsunaTupleCodeGeneration.root1_all_Dir.toFile)
    FileUtils.deleteDirectory(AsunaTupleCodeGeneration.root1_212_Dir.toFile)
    FileUtils.deleteDirectory(AsunaTupleCodeGeneration.root1_213_Dir.toFile)
    FileUtils.deleteDirectory(AsunaTupleCodeGeneration.root1_dotty_Dir.toFile)
    FileUtils.deleteDirectory(AsunaTupleCodeGeneration.root2Dir.toFile)
    FileUtils.deleteDirectory(AsunaTupleCodeGeneration.root3Dir.toFile)

    FileUtils.deleteDirectory(AsunaCoreCodeGeneration.root212Dir.toFile)
    FileUtils.deleteDirectory(AsunaCoreCodeGeneration.root213Dir.toFile)
    FileUtils.deleteDirectory(AsunaCoreCodeGeneration.rootAllDir.toFile)
    FileUtils.deleteDirectory(AsunaCoreCodeGeneration.rootDottyDir.toFile)

    FileUtils.deleteDirectory(AsunaTestKitCodeGeneration.rootDir.toFile)
  }
}
