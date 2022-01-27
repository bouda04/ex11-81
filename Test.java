public class Test {

	public static void main(String[] args) {
		IntNode chain = new IntNode(4, new IntNode(7, new IntNode(17)));

		printChain(createFromTail(17));
	}
	
	private static void printChain(IntNode chain) {
		if (chain == null)
			System.out.println("null");
		else {
			System.out.print(chain.getInfo() + "-->");
			printChain(chain.getNext());
		}
	}
	
	private static IntNode createFromHead(int size){
		IntNode result = new IntNode(0);
		IntNode temp=result;
		for (int i=1;i<size;i++) {
			temp.setNext(new IntNode(i));
			temp = temp.getNext();
		}
		return result;
	}
	
	private static IntNode createFromTail(int size){
		IntNode result = null;
		for (int i=0;i<size;i++) {
			result = new IntNode(i, result);
		}
		return result;
	}

}
