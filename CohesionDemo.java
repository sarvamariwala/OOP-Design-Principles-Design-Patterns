class BudgetReport
{	
	static void generateBudgetReport() { 
		System.out.println("generateBudgetReport");
	} 
} 

class ConnectToRDBMS {
static String getRDBMS() { 
	return "Get Connection for RDBMS";
} 
} 

class PrintStuff { 
static String getPrintOptions() {
		return "Get Print Options";
} 
} 

class FileSaver { 
static String getFileSaveOptions() {
		return "Get File SaveOptions";
} 
} 

class CohesionDemo{
	public static void main(String args[]){
		System.out.println(ConnectToRDBMS.getRDBMS());
		BudgetReport.generateBudgetReport();
		System.out.println(FileSaver.getFileSaveOptions());
		System.out.println(PrintStuff.getPrintOptions());
	}
}	