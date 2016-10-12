public class CircleOneLeftObject {
	public static void main(String[] args) {
		int circleSize = Integer.parseInt(args[0]); // the integer after command "java CircleOneLeftObject 10" will be parsed into an Integer
		CircleNew cir = new CircleNew (circleSize);
		System.out.println ("\nYou picked a circle contains " + circleSize + " kids.\n");
		
		cir.tempOutKid = cir.first.right.right;
		while (cir.count > 1){	
			cir.deleteKid(cir.tempOutKid);	
			cir.tempOutKid = cir.tempOutKid.right.right.right;								
		}
		
		/* from line 4 to line 11, we used another class CircleNew extended from Circle, there is a workaround to neglect 
		the CircleNew, shown as follows:
		
		Kid ko = cir.first;
		int countK = 1;
		while (cir.count > 1) {	
		
			if (countK++ == 3){
				countK = 1;
				cir.deleteKid(ko);	
			}
			ko = ko.right;
		}
		
		*/
		
		System.out.println ("\nThe Kid in place (from 0) " + cir.first.id + " was left.\n");
		
	}
}

class CircleNew extends Circle {
	Kid tempOutKid;
	
	CircleNew (int num) {
		super (num);
	}
}

class Kid {
	int id;
	Kid left;
	Kid right;
	
	Kid (int id) {
		this.id = id;		
	}
}

class Circle {
	int count = 0;
	Kid first;
	Kid last;
	
	Circle (int num) {
		for (int i = 0; i < num; i++)
			addOneKid();
	}
	
	void addOneKid() {
		Kid k = new Kid (count);
		if (count <= 0) {
			first = k;
			last = k;
			first.left = k;
			first.right = k;
		} 
		else {
			last.right = k;
			k.left = last;
			k.right = first;
			first.left = k;
			last = k;
		}			
		count++;
	}
	
	void deleteKid(Kid kd) {
		if (count <= 0)
			return;
		else if (count == 1){
			first = last = null;
		} else {
			kd.left.right = kd.right;
			kd.right.left = kd.left;
			if (kd == first) {
				first = kd.right;
			} else if (kd == last) {
				last = kd.left;
			}
		}
		count--;
	}
}
