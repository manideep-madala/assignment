package assignment;

public class EceTrainee  extends Trainee {
	private String devicesused;
	public EceTrainee(int id,String name,String devicesused) {
		super(id,name);
		this.devicesused=devicesused;
	}
	public String getDevicesused() {
		return devicesused;
	}
	public void setDevicesused(String devicesused) {
		this.devicesused = devicesused;

}
}