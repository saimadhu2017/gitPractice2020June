public class Wipro1A{
	public static void main(String[] args){
		IciciBank ic=new IciciBank();
		int i=10;
		if(i==10){
			System.out.println("This is Vennket's code");
		}
		esle{
		System.out.println(ic.getFixedInterestRate()+","+ic.getSavingInterestRate());
		KotMBank ko=new KotMBank();
		System.out.println(ko.getFixedInterestRate()+","+ko.getSavingInterestRate());
		GeneralBank gk=new KotMBank();
		System.out.println(gk.getFixedInterestRate()+","+gk.getSavingInterestRate());
		GeneralBank gi=new IciciBank();
		System.out.println(gi.getFixedInterestRate()+","+gi.getSavingInterestRate());
		}

	}
}
abstract class GeneralBank{
	abstract public double getSavingInterestRate();
	abstract public double getFixedInterestRate();
}
class IciciBank extends GeneralBank{

	@Override
	public double getSavingInterestRate() {
		return(4);
	}

	@Override
	public double getFixedInterestRate() {
		return(8.5);
	}
}
class KotMBank extends GeneralBank{

	@Override
	public double getSavingInterestRate() {
		return(6);
	}

	@Override
	public double getFixedInterestRate() {
		return(9);
	}
}
