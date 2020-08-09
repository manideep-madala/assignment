package assignment;
import java.util.*;

public class TraineeMain {
	Map<Integer,Trainee> store=new HashMap<>();
	Set<CsTrainee> cstrainee=new HashSet<>();
	Set<EceTrainee> ecetrainee=new HashSet<>();
	public static void main(String[] args) {
		TraineeMain demo=new TraineeMain();
		demo.runUi();
	}
	public void runUi() {
		CsTrainee cs=new CsTrainee(21,"mani",3);
		EceTrainee ece=new EceTrainee(23,"deep","diode");
		store.put(cs.getId(),cs);
		store.put(ece.getId(), ece);
		for(Trainee trainee:store.values()) {
			
			boolean iscs= trainee instanceof CsTrainee;
			if(iscs) {
				cstrainee.add((CsTrainee) trainee);
			}
			else {
				ecetrainee.add((EceTrainee) trainee);
			}
		}
		System.out.println("diplay cstrainees");
		for(CsTrainee csset:cstrainee) {
			int id=csset.getId();
			String name=csset.getName();
			int languages=csset.getLanguages();
			System.out.println("Id="+id+"name is "+name+" languages known "+languages);
		}
		System.out.println("diplay ecetrainees");
		for(EceTrainee eceset:ecetrainee) {
			int id=eceset.getId();
			String name=eceset.getName();
			String devicesused=eceset.getDevicesused();
			System.out.println("Id="+id+"name is "+name+" devices used "+devicesused);
		}

	}

}
