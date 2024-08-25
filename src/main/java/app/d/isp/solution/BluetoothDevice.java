package main.java.app.d.isp.solution;

public interface BluetoothDevice {

	public void enableBluetooth();

	public boolean doLink(String deviceId);

	public void turnOffDevice();

}
