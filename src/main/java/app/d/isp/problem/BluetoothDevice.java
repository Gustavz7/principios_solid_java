package main.java.app.d.isp.problem;

public interface BluetoothDevice {

	public void enableBluetooth();

	public boolean doLink(String deviceId);

	public void turnOffDevice();

	public void playMusic();

}
