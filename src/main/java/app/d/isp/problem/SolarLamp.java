package main.java.app.d.isp.problem;

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

	@Override
	public void playMusic() {
		// este metodo lo invalidamos manualmente ya que una lampara no puede reproducir
		// musica
		throw new RuntimeException("lampara solar no soporta la funcionalidad playMusic()");
	}

}
