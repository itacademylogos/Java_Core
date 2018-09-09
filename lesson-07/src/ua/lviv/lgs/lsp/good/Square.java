package ua.lviv.lgs.lsp.good;

public class Square implements Squire{
	int width;
	
	
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int calculateSquire() {
		return width * width;
	}

}
