class Capacity_builder{
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Java is my favourite langauge.");
		System.out.println(sb.capacity());
	}
}
