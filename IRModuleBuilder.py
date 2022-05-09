from llvmlite import ir
from llvmlite.ir import Argument
import llvmlite.binding as llvm
from numpy import void

class IRModuleBuilder():
    call_stack = []

    def __init__(self) -> None:
        self.module = ir.Module(name=__file__)
        self.typ_void = ir.FunctionType(ir.VoidType(), [])
        self.double = ir.DoubleType()

    def call (name,functype, *args):
        pass

    def main(self):
        fct_main = ir.Function(self.module, self.typ_void, name = 'main')
        blck_main = fct_main.append_basic_block(name='MAIN')
        bldr_main = ir.IRBuilder(blck_main)
        bldr_main.ret_void()
        
    def func1(self):
        fnty = ir.FunctionType(self.double, (self.double, self.double))
        func = ir.Function(self.module, fnty, name = 'fadd')
        block = func.append_basic_block(name="entry")
        builder = ir.IRBuilder(block)
        a, b = func.args
        result = builder.fadd(a, b, name="res")
        builder.ret(result)
        self.call_stack.append(func)

    def genLL(self):
        llvm_ir = str(self.module)
        with open("%s.ll" % "main", "w") as o:
            o.write(llvm_ir)

