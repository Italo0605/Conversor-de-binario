import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        //declarando variaveis
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor digite o valor em binario:");
        int binario = sc.nextInt(), count, decimal=0;
        int binarioCopy = binario;
        int[] num = new int[20];
        
        //dividindo o numero em algarismos
        for(count = 0; binario >= 1; count++){
            num[count] = binario % 10;
            binario /= 10;
        }
        // Elevando para somar e resultar no decimal
        for(int i = 0; i < count; i++){
            decimal += num[i] * Math.pow(2, i);
        }

        //Print and SCFechando scanner
        System.out.println("valor do binario "+binarioCopy+" em decimal: "+decimal);
        sc.close();

    }
}


