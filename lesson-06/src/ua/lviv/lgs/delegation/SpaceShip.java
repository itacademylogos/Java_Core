package ua.lviv.lgs.delegation;

public class SpaceShip {
	private String shipName;
	private SpaceShipControls spaceShipControls = new SpaceShipControls() ;

	public SpaceShip(String shipName) {
		this.shipName = shipName;
	}

	public void moveUp(Integer kilometer) {
		spaceShipControls.up(kilometer);
	}

	public void moveDown(Integer kilometer) {
		spaceShipControls.down(kilometer);
	}

	public void moveRight(Integer kilometer) {
		spaceShipControls.right(kilometer);
	}

	public void moveLeft(Integer kilometer) {
		spaceShipControls.left(kilometer);
	}

	public String getShipName() {
		return shipName;
	}

	
	
}
