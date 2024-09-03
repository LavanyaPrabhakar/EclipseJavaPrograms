package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingOperations 
{
	public static void main(String[] args)
	{
			
/*	
		//1. Folder Creation
		
		File file = new File("C:\\Users\\LPrab\\OneDrive\\Desktop\\King");
		boolean present = file.exists();
		System.out.println(present);
		if(present==false)
		{
			file.mkdir();
		}
		else
		{
			System.out.println("Folder already present");
		}	
		
		//2. Sub-Folders Creation
		
		File file = new File("C:\\Users\\LPrab\\OneDrive\\Desktop\\King\\Queen\\Princess\\sample.txt");
		boolean present = file.exists();
		System.out.println("Folders present="+present);
		if(present==false)
		{
			file.mkdirs();
		}
		else
		{
			System.out.println("Folder already present");
		}	
		
		//3. File Creation
		
		File file = new File("C:\\Users\\LPrab\\OneDrive\\Desktop\\sample.txt");
		try {
			System.out.println(file.exists());
			file.createNewFile();
			System.out.println(file.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//File writing
		
		File file = new File("C:\\Users\\LPrab\\OneDrive\\Desktop\\sample.txt");
		try {
			FileWriter fw= new FileWriter(file);
			file.wr
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
		
		//4. File Deletion
		
		File file = new File("C:\\Users\\LPrab\\OneDrive\\Desktop\\sample.txt");
		
			System.out.println(file.exists());
			file.delete();
			System.out.println(file.exists()); 
		
		//5. File Rename
		File newName= new File("C:\\Users\\LPrab\\OneDrive\\Desktop\\King\\Queen\\Princess\\demo.txt");
		File file = new File("C:\\Users\\LPrab\\OneDrive\\Desktop\\King\\Queen\\Princess\\sample.txt");
		boolean present= file.exists();
		System.out.println(present);
		if (present)
		{
			boolean renameSuccess=file.renameTo(newName);
			System.out.println("renameSuccess"+renameSuccess);
			
		}	
		
		//6. Printing File Name
		
		File file= new File("C:\\Users\\LPrab\\OneDrive\\Desktop\\King\\Queen\\Princess\\demo.txt");
		System.out.println("File Name : "+file.getName());
		
		
	//7. Listing all files and folders in a directory
		
		File file= new File("C:\\Users\\LPrab\\OneDrive\\Desktop");
		String[] desktopFolders=file.list();
		System.out.println("Desktop Folders List :");
		System.out.println();
		for(String s: desktopFolders)
		{
			System.out.println(s);
		}
			
			
		// 8. Listing only files 
		File file= new File("C:\\Users\\LPrab\\OneDrive\\Desktop");
		File[] listOfFiles= file.listFiles();
		for(File fl: listOfFiles )
		{
			System.out.println(fl);
		}
		 	
		// 9. Listing only folders
		File file= new File("C:\\Users\\LPrab\\OneDrive\\Desktop");
		 
		 
		File[] listOfFiles= file.listFiles();
		for(File fl: listOfFiles )
		{
			if(fl.isFile())
			{
			System.out.println(fl);
			}
		}
		
		String extention = parts[1];
				if(extention.contentEquals("txt"))
				{
				System.out.println(fl);
				}
			*/
		
					
						
				
			
		

	}
}
