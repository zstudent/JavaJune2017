package lesson170821;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {
	
	public static void main(String[] args) {
		
		Supplier<LocalDate> dateSupplier3 = new Supplier<LocalDate>() {
			
			@Override
			public LocalDate get() {
				return LocalDate.now();
			}
		};

		Supplier<LocalDate> dateSupplier2 = () -> LocalDate.now();

		Supplier<LocalDate> dateSupplier = LocalDate::now;
		
		LocalDate localDate = dateSupplier.get();
		
		System.out.println(localDate);
		
		Supplier<ArrayList<String>>  arrayListSupplier = () -> new ArrayList<>();
		Supplier<ArrayList<String>>  arrayListSupplier2 = ArrayList::new;
		
		ArrayList<String> arrayList = arrayListSupplier2.get();
	
		
	}

}
