package week7.day2;

import week1.library.Library;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LibraryFrame extends JFrame {

  public static final String TITLE = "My library app";

  private Library library;

  public LibraryFrame(Library library) throws HeadlessException {
    super(TITLE);
    this.library = library;
    setSize(400, 400);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
    init();
  }

  private void init() {
    JPanel buttonPanel = new JPanel(new GridLayout(2, 1));

    JButton addButton = new JButton("Add");
    JButton showAllButton = new JButton("Show");

    final JTextArea textArea = new JTextArea();
    textArea.setLineWrap(true);

    addButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textArea.append("Ha ha ha");
      }
    });


    buttonPanel.add(addButton);
    buttonPanel.add(showAllButton);


    getContentPane().add(buttonPanel, BorderLayout.WEST);
    getContentPane().add(textArea);

  }
}
