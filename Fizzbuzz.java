public class Fizzbuzz {
    public static void main(String[] args) {
        //もし、コマンド引数が二個以上渡されたら
        if (1<args.length) {
            System.out.println("申し訳ございませんが数字を一つだけお入れください。");          
        }else{
            int num1 = Integer.parseInt(args[0]);
            for(int i=1; i<num1;i++){
                if(i%15==0){
                System.out.print("FizzBuzz ");
                }else if (i%5==0){
                System.out.print("Buzz ");    
                }else if (i%3==0){
                System.out.print("Fizz ");
                }else
                System.out.print(i+" ");  
                }
        }

    }
 }       
