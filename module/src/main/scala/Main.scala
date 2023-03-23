import chisel3._
import chisel3.util._

class Main extends Module {
  val io = IO(new Bundle {
    val in = Input(UInt(8.W))
    val out = Output(UInt(8.W))
  })
  io.out := io.in // Does nothing. :)
}

object Main extends App {
  emitVerilog(new Main())
}
