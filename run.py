from LanguageListener import LanguageListener
from Compiler import Compiler
from generated.LanguageLexer import LanguageLexer
from generated.LanguageParser import LanguageParser
from IRModuleBuilder import IRModuleBuilder
from antlr4 import *
import sys

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = LanguageLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = LanguageParser(stream)
    tree = parser.start()
    # print(tree.toStringTree(recog=parser))

    listener = LanguageListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)
    # print(listener.module)

    # module1 = IRModuleBuilder()
    # module1.func1()
    # module1.main()
    # module1.genLL()


if __name__ == '__main__':
    main(sys.argv)