public class ArgsLastPrinter {
    public static void main(String[] args) {
        //引数の個数を入れる。
        int last = args.length;
        //引数の個数が０か否かの判定後表示する。
        if (last == 0)
          System.out.println("なし");
        else
          System.out.println(args[last-1]);          
        }
      }  