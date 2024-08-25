package main.java.app.d.isp.problem;

public class Smartwatch implements BluetoothDevice {

	@Override
	public void enableBluetooth() {
		// implementacion para encender el bluetooth en este dispositivo
	}

	@Override
	public boolean doLink(String deviceId) {
		// implementacion para linkear con otro dispositivo

		return true;
	}

	@Override
	public void turnOffDevice() {
		// metodo para apagar
	}

	@Override
	public void playMusic() {
		// metodo para dar la instruccion de reproducir musica
	}

}
