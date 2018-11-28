package com.netcraker.library;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditFrame extends MyFrame{

    public EditFrame(int index, BookModel model) {
        setTitle("Edit Book");
        setSize(450, 350);
        setLocation(450, 300);
        setLayout( new GridLayout(0, 1));
        setBackground(Color.lightGray);

        JPanel namePanel = new JPanel(); //
        namePanel.add(new JLabel("Book's title: "));
        JTextField nameText = new JTextField(model.getBookList().get(index).getName(), 30);
        namePanel.add(nameText);
        add(namePanel);

        JPanel authorNamePanel = new JPanel();
        authorNamePanel.add(new JLabel("Author's name: "));
        JTextField authorNameText = new JTextField(model.getBookList().get(index).getAuthor().getName(), 30);
        authorNamePanel.add(authorNameText);
        add(authorNamePanel);

        JPanel authorGender = new JPanel();
        authorGender.add(new JLabel("Author's gender: "));
        ButtonGroup group = new ButtonGroup();
        JRadioButton male = new JRadioButton("male");
        JRadioButton female = new JRadioButton("female");
        group.add(male);
        group.add(female);
        if(model.getBookList().get(index).getAuthor().getGender().equals("male")){
            male.setSelected(true);
        }
        else{
            female.setSelected(true);
        }
        authorGender.add(male);
        authorGender.add(female);
        add(authorGender);

        JPanel authorCountry = new JPanel();
        authorCountry.add(new JLabel("Author's country: "));
        JTextField authorCountryText = new JTextField(model.getBookList().get(index).getAuthor().getCountry(),20);
        authorCountry.add(authorCountryText);
        add(authorCountry);

        JPanel genrePanel = new JPanel();
        genrePanel.add(new JLabel("Genre of book: "));
        String genre[] = new String []{
                "autobiography",  "children's books", "cook-books", "dictionary", "encyclopedia", "fairytale","fanatasy",
                "fiction", "history", "horror", "medicine", "non-fuction", "poems", "politics", "religious", "romance",
                "science-fiction", "series", "thriller", "travel books", "other"};
        JComboBox genreCombobox = new JComboBox(genre);
        genreCombobox.setEditable(true);
        genreCombobox.setSelectedItem(model.getBookList().get(index).getGenre());
        genrePanel.add(genreCombobox);
        add(genrePanel);

        JPanel yearPanel = new JPanel();
        yearPanel.add(new JLabel("Year of book's publication: "));
        JTextField yearText = new JTextField(Integer.toString( model.getBookList().get(index).getYear()),4);
        yearPanel.add(yearText);
        add(yearPanel);

        JPanel pricePanel = new JPanel();
        pricePanel.add(new JLabel("Price of book: "));
        JTextField priceText = new JTextField(Double.toString( model.getBookList().get(index).getPrice()),10);
        pricePanel.add(priceText);
        add(pricePanel);

        JPanel qtyPanel = new JPanel();
        qtyPanel.add(new JLabel("Quantity of books: "));
        JTextField qtyText = new JTextField(Integer.toString( model.getBookList().get(index).getQty()),5);
        qtyPanel.add(qtyText);
        add(qtyPanel);

        JPanel button = new JPanel();
        JButton saveButton = new JButton("Save changes");
        saveButton.setBackground(Color.lightGray);
        button.add(saveButton);
        saveButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validation(nameText, authorNameText, authorCountryText, yearText, priceText, qtyText, male, female)) {
                    BookModel book = new BookModel();
                    book.editBook(createBook(nameText, authorNameText, authorCountryText, genreCombobox, yearText, priceText, qtyText, male, female), index);
                    dispose();
                    model.readFile();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please, enter correct information in all fields");
                }
            }
        });
        add(button);

        setVisible(true);
    }
}
