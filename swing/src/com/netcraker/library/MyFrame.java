package com.netcraker.library;

import javax.swing.*;

public class MyFrame extends JFrame {  //MyFrame has equals methods for both AddFrame and EditFrame

    public boolean validation(JTextField nameText, JTextField authorNameText,
                              JTextField authorCountryText, JTextField yearText, JTextField priceText,
                              JTextField qtyText, JRadioButton male, JRadioButton female) {
        if(nameText.getText().equals("")) {
            return false;
        }
        if(authorNameText.getText().equals("")) {
            return false;
        }
        if(authorCountryText.getText().equals("")){
            return false;
        }
        if(yearText.getText().equals("")) {
            return false;
        }
        if(priceText.getText().equals("")) {
            return false;
        }
        if(qtyText.getText().equals("")) {
            return false;
        }
        if(!male.isSelected() && !female.isSelected()){
            return false;
        }
        try{
            Integer.parseInt(yearText.getText());
            Double.parseDouble(priceText.getText());
            Integer.parseInt(qtyText.getText());
        }
        catch(NumberFormatException e){
            return false;
        }
        if(Integer.parseInt(yearText.getText()) <= 0 ||  Double.parseDouble(priceText.getText()) <= 0
                || Integer.parseInt(qtyText.getText()) <=0){
            return false;
        }
        return true;
    }

    public Book createBook(JTextField nameText, JTextField authorNameText,
                           JTextField authorCountryText, JComboBox genreCombobox, JTextField yearText, JTextField priceText,
                           JTextField qtyText, JRadioButton male, JRadioButton female) {
        String name = nameText.getText();
        String authorName = authorNameText.getText();
        String authorGender = "";
        if(male.isSelected()) {
            authorGender = "male";
        }
        else if(female.isSelected()) {
            authorGender = "female";
        }
        String authorCountry = authorCountryText.getText();
        String genre = genreCombobox.getSelectedItem().toString();
        int year = Integer.parseInt(yearText.getText());
        double price = Double.parseDouble(priceText.getText());
        int qty = Integer.parseInt(qtyText.getText());
        Author newAuthor = new Author(authorName, authorGender, authorCountry);
        Book newBook = new Book(name, newAuthor, genre, year, price, qty);
        return newBook;
    }

}
