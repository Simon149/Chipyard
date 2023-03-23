import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class Tester extends AnyFlatSpec with ChiselScalatestTester {
  "Main" should "do nothing" in {
    test(new Main) { dut =>
      dut.io.in.poke(0x01.U)
      dut.io.out.expect(0x01.U)
    }
  }
}
