package TasksOOPS.TaskAbsOOPS;

abstract public class Marks {
double percentage;
int physics;
int chemistry;
int maths;
int biology;
public double MarksA(int physics, int chemistry, int maths) {
	if(physics<=100 && chemistry<=100 && maths<=100) {
		percentage=(physics+chemistry+maths)/3;
	}
	else {
		System.out.println("Inavlid marks!");
	}
	return percentage;
} 
public double MarksB(int physics, int chemistry, int maths, int biology) {
	if(physics<=100 && chemistry<=100 && maths<=100 && biology<=100) {
		percentage=(physics+chemistry+maths+biology)/4;
	}
	else {
		System.out.println("Inavlid marks!");
	}
	return percentage;
}
abstract public double getPercent();
}
