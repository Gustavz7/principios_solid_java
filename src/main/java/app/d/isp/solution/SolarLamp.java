package main.java.app.d.isp.solution;

public class SolarLamp implements BluetoothDevice {

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

}
