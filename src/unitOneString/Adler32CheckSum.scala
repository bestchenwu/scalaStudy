package unitOneString

object Adler32CheckSum {

  val MOD_ADLER = 65521;

  def main(args: Array[String]) {
    val sum = adler32sum("helloworld");
    print(s"sum=$sum");
  }

  def adler32sum(s: String): Int = {
    var a = 1;
    var b = 0;
    s.getBytes.foreach { char =>
      a = (char + a) % MOD_ADLER;
      b = (b + a) % MOD_ADLER;
    }
    b * 65536 + a;

  }
}