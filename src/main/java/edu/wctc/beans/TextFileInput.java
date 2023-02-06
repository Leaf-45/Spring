package edu.wctc.beans;

import edu.wctc.Sale;
import edu.wctc.iface.ISalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileInput implements ISalesInput {
    @Override
    public List<Sale> getSales() {
        final String fileName = "sales.txt";
        File file = new File(fileName);
        List<Sale> allSales = new ArrayList<>();
        try
        {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext())
            {
                String[] saleData = scanner.nextLine().split(",");

                allSales.add(new Sale(saleData[0], saleData[1], Double.parseDouble(saleData[2]),
                        Double.parseDouble(saleData[3])));
            }

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("File data not found");
        }
        return allSales;
    }
}
