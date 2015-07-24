package week7.day2;

import week1.library.Library;
import week5.day1.MyList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LibraryFrame extends JFrame {

  public static final String TITLE = "My library app";

  private Library library;
  JButton addButton;
  JButton showAllButton;
  JTextArea textArea;

  public LibraryFrame(Library library) throws HeadlessException {
    super(TITLE);
    this.library = library;
    init();
  }

  private void init() {
    setSize(600, 400);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);

    setupButtons();
    setupTextArea();
  }

  private void setupTextArea() {
    textArea = new JTextArea();
    textArea.setLineWrap(true);
    textArea.setEditable(false);
    getContentPane().add(textArea);
  }

  private void setupButtons() {
    JPanel buttonPanel = new JPanel(new GridLayout(2, 1));
    addButton = new JButton("Add");
    addButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textArea.append("Ha ha ha");
        JOptionPane.showMessageDialog(new JDialog(), "Eggs are not supposed to be green.");
      }
    });

    showAllButton = new JButton("Show");
    showAllButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MyList bookList  = library.getBooks();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < bookList.size(); i++) {
          builder.append(bookList.get(i)).append("\n");
        }

        textArea.setText(builder.toString());

      }
    });

    buttonPanel.add(addButton);
    buttonPanel.add(showAllButton);
    getContentPane().add(buttonPanel, BorderLayout.WEST);
  }
}
