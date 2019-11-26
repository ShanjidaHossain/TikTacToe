package com.toe.tac.tic.Shanjida;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

public class GamesController {

	@FXML
	private FlowPane fpLayout;

	@FXML
	private Label idTitle;

	@FXML
	private Button btnReset;

	@FXML
	private Label lvlMessage;

	@FXML
	private Label author;

	@FXML
	private Label L1;

	@FXML
	private Label L2;

	@FXML
	private Label L3;

	@FXML
	private Label L4;

	@FXML
	private Label L5;

	@FXML
	private Label L6;

	@FXML
	private Label L7;

	@FXML
	private Label L8;

	@FXML
	private Label L9;
	private boolean isX = true;

	@FXML
	void onReset(MouseEvent event) {
		ObservableList<Node> items = this.fpLayout.getChildren();
		items.forEach(e -> {
			Label label = (Label) e;
			label.setText("?");
			label.setTextFill(Color.BLACK);
			lvlMessage.setText("");
		});
	}
	
	@FXML
	void XOrOSelected(MouseEvent event) {
		Label label = (Label) event.getSource(); // Down Casting = going from object to level
		lvlMessage.setText("");

		// This will allow the player make move once and let the other player go, this
		// is to prevent each player move more than once more than once
		if (!label.getText().equals("?")) {

			String message = " Illegal Move, Stop it!";
			lvlMessage.setText(message);
			return;
		}
		String whichMove = isX ? "X" : "O";
		label.setText(whichMove);

		// Checking from Row 1
		if (L1.getText().equals("X") && (L2.getText().equals("X") && (L3.getText().equals("X")))) {

			String message2 = "Winner IS X !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L1.setTextFill(Color.RED);
			L2.setTextFill(Color.RED);
			L3.setTextFill(Color.RED);

			return;
		}

		// Checking from Row 2
		if (L4.getText().equals("X") && (L5.getText().equals("X") && (L6.getText().equals("X")))) {

			String message2 = "Winner IS X !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L4.setTextFill(Color.RED);
			L5.setTextFill(Color.RED);
			L6.setTextFill(Color.RED);

			return;
		}

		// Checking from Row 3
		if (L7.getText().equals("X") && (L8.getText().equals("X") && (L9.getText().equals("X")))) {

			String message2 = "Winner IS X !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L7.setTextFill(Color.RED);
			L8.setTextFill(Color.RED);
			L9.setTextFill(Color.RED);
			return;
		}

		// Checking from Column 1
		if (L1.getText().equals("X") && (L4.getText().equals("X") && (L7.getText().equals("X")))) {

			String message2 = "Winner IS X !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L1.setTextFill(Color.RED);
			L4.setTextFill(Color.RED);
			L7.setTextFill(Color.RED);

			return;
		}

		// Checking from Column 2
		if (L2.getText().equals("X") && (L5.getText().equals("X") && (L8.getText().equals("X")))) {

			String message2 = "Winner IS X !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L2.setTextFill(Color.RED);
			L5.setTextFill(Color.RED);
			L8.setTextFill(Color.RED);
			return;
		}

		// Checking from Column 3
		if (L3.getText().equals("X") && (L6.getText().equals("X") && (L9.getText().equals("X")))) {

			String message2 = "Winner IS X !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L3.setTextFill(Color.RED);
			L6.setTextFill(Color.RED);
			L9.setTextFill(Color.RED);
			return;
		}

		// Checking from Across 1
		if (L1.getText().equals("X") && (L5.getText().equals("X") && (L9.getText().equals("X")))) {

			String message2 = "Winner IS X !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L1.setTextFill(Color.RED);
			L5.setTextFill(Color.RED);
			L9.setTextFill(Color.RED);
			return;
		}

		// Checking from Across 2
		if (L3.getText().equals("X") && (L5.getText().equals("X") && (L7.getText().equals("X")))) {

			String message2 = "Winner IS X !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L3.setTextFill(Color.RED);
			L5.setTextFill(Color.RED);
			L7.setTextFill(Color.RED);
			return;
		}

		// Now Checking For O

		// Checking from Row 1
		if (L1.getText().equals("O") && (L2.getText().equals("O") && (L3.getText().equals("O")))) {

			String message2 = "Winner IS O !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L1.setTextFill(Color.RED);
			L2.setTextFill(Color.RED);
			L3.setTextFill(Color.RED);

			return;
		}

		// Checking from Row 2
		if (L4.getText().equals("O") && (L5.getText().equals("O") && (L6.getText().equals("O")))) {

			String message2 = "Winner IS O !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L4.setTextFill(Color.RED);
			L5.setTextFill(Color.RED);
			L6.setTextFill(Color.RED);

			return;
		}

		// Checking from Row 3
		if (L7.getText().equals("O") && (L8.getText().equals("O") && (L9.getText().equals("O")))) {

			String message2 = "Winner IS O !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L7.setTextFill(Color.RED);
			L8.setTextFill(Color.RED);
			L9.setTextFill(Color.RED);
			return;
		}

		// Checking from Column 1
		if (L1.getText().equals("O") && (L4.getText().equals("O") && (L7.getText().equals("O")))) {

			String message2 = "Winner IS O !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L1.setTextFill(Color.RED);
			L4.setTextFill(Color.RED);
			L7.setTextFill(Color.RED);

			return;
		}

		// Checking from Column 2
		if (L2.getText().equals("O") && (L5.getText().equals("O") && (L8.getText().equals("O")))) {

			String message2 = "Winner IS O !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L2.setTextFill(Color.RED);
			L5.setTextFill(Color.RED);
			L8.setTextFill(Color.RED);
			return;
		}

		// Checking from Column 3
		if (L3.getText().equals("O") && (L6.getText().equals("O") && (L9.getText().equals("O")))) {

			String message2 = "Winner IS O !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L3.setTextFill(Color.RED);
			L6.setTextFill(Color.RED);
			L9.setTextFill(Color.RED);

			return;
		}

		// Checking from Across 1
		if (L1.getText().equals("O") && (L5.getText().equals("O") && (L9.getText().equals("O")))) {

			String message2 = "Winner IS O !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L1.setTextFill(Color.RED);
			L5.setTextFill(Color.RED);
			L9.setTextFill(Color.RED);
			return;
		}

		// Checking from Across 2
		if (L3.getText().equals("O") && (L5.getText().equals("O") && (L7.getText().equals("O")))) {

			String message2 = "Winner IS O !";
			lvlMessage.setText(message2);

			// SET the winner color to Red
			L3.setTextFill(Color.RED);
			L5.setTextFill(Color.RED);
			L7.setTextFill(Color.RED);
			return;
		}

		isX = !isX;

		// Professors Code
		/*
		 * Label 1 = (Label) event.getSource();
		 * 
		 * String xOro = (isX = !isX) ? "X" : "O"; 1.setText(xOro); return; }
		 */

	}

}
