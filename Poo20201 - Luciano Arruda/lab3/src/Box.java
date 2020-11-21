public class Box {
	// protege a variavel de instancia, apenas uma instancia de Box pode acessa-lo
	private int size;
	// fornece getters e setters publicos
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
}
