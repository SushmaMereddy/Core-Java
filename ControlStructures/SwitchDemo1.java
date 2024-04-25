class SwitchDemo1{
	public static void main(String[] args){
		char opt='I';
		switch(opt){
			case 'I': System.out.println("INDIA");
				break;
			case 'A': System.out.println("AMERICA");
				break;
			case 'G': System.out.println("Germany");
				break;
			case 'S': System.out.println("Switzerland");
				break;
			default: System.out.println("MARS");
		}
	}
}