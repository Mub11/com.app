public class SayHello{
    public static void main(String[] args){
        System.out.println("Hello World !");
		sayHello(sum());
		//SayHello sayhello = new SayHello();
		//sayhello.sayHello(sayhello.sum());
	}
	public static void sayHello(int sum){
		System.out.println("sayHello" + sum);
	}
	public static int sum(){
		int sum = 0;
		for(int i = 0; i <= 100; i++){
			sum += i;
		}
		return sum;
	}
}