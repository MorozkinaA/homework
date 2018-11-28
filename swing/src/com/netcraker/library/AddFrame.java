package com.netcraker.library;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class AddFrame extends MyFrame {

        public AddFrame(BookModel model){
            //super("Add Book");
            setTitle("Add Book");
            setSize(450, 350);
            setLocation(450, 300);
            setLayout( new GridLayout(0, 1));
            setBackground(Color.lightGray);


            JPanel namePanel = new JPanel(); //
            namePanel.add(new JLabel("Book's title: "));
            JTextField nameText = new JTextField(30);
            namePanel.add(nameText);
            add(namePanel);

            JPanel authorNamePanel = new JPanel();
            authorNamePanel.add(new JLabel("Author's name: "));
            JTextField  authorNameText = new JTextField(28);
            authorNamePanel.add(authorNameText);
            add(authorNamePanel);

            JPanel authorGender = new JPanel();
            authorGender.add(new JLabel("Author's gender: "));
            ButtonGroup group = new ButtonGroup();
            JRadioButton male = new JRadioButton("male");
            JRadioButton female = new JRadioButton("female");
            group.add(male);
            group.add(female);
            authorGender.add(male);
            authorGender.add(female);
            add(authorGender);

            JPanel authorCountry = new JPanel();
            authorCountry.add(new JLabel("Author's country: "));
            JTextField authorCountryText = new JTextField(27);
            authorCountry.add(authorCountryText);
            add(authorCountry);

            JPanel genrePanel = new JPanel();
            genrePanel.add(new JLabel("Genre of book: "));
            String genre[] = new String []{
                    "autobiography",  "children's books", "cook-books", "dictionary", "encyclopedia", "fairytale","fantasy",
                    "fiction", "history", "horror", "medicine", "non-fuction", "poems", "politics", "religious", "romance",
                    "science-fiction", "series", "thriller", "travel books", "other"};
            JComboBox genreCombobox = new JComboBox(genre);
            genreCombobox.setEditable(true);
            genrePanel.add(genreCombobox);
            add(genrePanel);

            JPanel yearPanel = new JPanel();
            yearPanel.add(new JLabel("Year of book's publication: "));
            JTextField yearText = new JTextField(22);
            yearPanel.add(yearText);
            add(yearPanel);

            JPanel pricePanel = new JPanel();
            pricePanel.add(new JLabel("Price of book: "));
            JTextField priceText = new JTextField(28);
            pricePanel.add(priceText);
            add(pricePanel);

            JPanel qtyPanel = new JPanel();
            qtyPanel.add(new JLabel("Quantity of books: "));
            JTextField qtyText = new JTextField(26);
            qtyPanel.add(qtyText);
            add(qtyPanel);

            JPanel button = new JPanel();
            JButton addButton = new JButton("Add book");
            addButton.setBackground(Color.lightGray);
            button.add(addButton);
            add(button);

            addButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(validation(nameText, authorNameText, authorCountryText, yearText, priceText, qtyText, male, female)) {
                       model.addBook(createBook(nameText, authorNameText, authorCountryText, genreCombobox, yearText, priceText, qtyText, male, female));
                       dispose();
                       model.readFile();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Please, enter correct information in all fields");
                    }
                }
            });

            setVisible(true);

        }
    }

