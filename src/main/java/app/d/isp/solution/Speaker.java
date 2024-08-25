package main.java.app.d.isp.solution;

public class Speaker implements BluetoothDevice, Music {

	@Override
	public void enableBluetooth() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean doLink(String deviceId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void turnOffDevice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMusic() {
		// ahora solo hacemos uso de la interfaz espefica en esta clase, las demas
		// pueden seguir usando BluetoothDevice base
	}

}
