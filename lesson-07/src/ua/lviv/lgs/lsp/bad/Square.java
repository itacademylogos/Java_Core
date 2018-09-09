package ua.lviv.lgs.lsp.bad;

public class Square extends Rectangle {
	public void setWeight(int weight) {
		this.weight = weight;
		this.height = weight;
	}

	public void setHeight(int height) {
		this.height = height;
		this.weight = height;
	}
}
