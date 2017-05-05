public class ProxyBook extends Book {

	private RealBook rBook;
	private String name;

	public ProxyBook(String name) {
		// TODO - implement ProxyBook.ProxyBook
		throw new UnsupportedOperationException();

		this.name = name
	}

	public void Request() {
		// TODO - implement ProxyBook.Request
		throw new UnsupportedOperationException();

		if(rBook == null) {
			rBook = new RealBook(name);
		}
		rBook.request();
	}
}
