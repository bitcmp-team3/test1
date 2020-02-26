package test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

	JTextField tf;
	JPanel panel;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;

	String val1 = null, val2 = null, sign = null; // val1�� va2�� �ǿ�����, sign�� ������
	Double result = 0.0; // ������ ����� ����

	public Calculator() {
		// �ݱ� ��ư�� ������ �޸𸮿��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // ������ â ������ ����

		// ������Ʈ ��ü ����
		tf = new JTextField("0", 20); // �ʱ� 0�� ���, ũ�� 20
		tf.setHorizontalAlignment(JTextField.RIGHT); // �ʱ� 0�� ������ ����
		b1 = new JButton("<-");
		b2 = new JButton("ce");
		b3 = new JButton("c");
		b4 = new JButton("/");
		b5 = new JButton("7");
		b6 = new JButton("8");
		b7 = new JButton("9");
		b8 = new JButton("*");
		b9 = new JButton("4");
		b10 = new JButton("5");
		b11 = new JButton("6");
		b12 = new JButton("-");
		b13 = new JButton("1");
		b14 = new JButton("2");
		b15 = new JButton("3");
		b16 = new JButton("+");
		b17 = new JButton("0");
		b18 = new JButton("00");
		b19 = new JButton(".");
		b20 = new JButton("=");

		// �г��� ���̾ƿ�����
		panel = new JPanel();
		panel.setLayout(new GridLayout(5, 4, 2, 2));

		// �гο� ��ư�� ����
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);
		panel.add(b16);
		panel.add(b17);
		panel.add(b18);
		panel.add(b19);
		panel.add(b20);

		// �����ӿ� ����
		add(tf, "North");
		add(panel);

		// ��ư�� �̺�Ʈ�� ����
		// implements ActionListener - �� Ŭ�������� �޾����Ƿ� this
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);

		setTitle("Calculator");
		setSize(230, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator();
	}

	@Override // interface�� �����Ͽ����Ƿ� ActionListener�� actionPerformed �������̵� �ʿ�
	public void actionPerformed(ActionEvent e) {

		String data = e.getActionCommand(); // ��ư�� �󺧰��� ����

		if (data.equals("0") || data.equals("1") || data.equals("2") || data.equals("3") || data.equals("4")
				|| data.equals("5") || data.equals("6") || data.equals("7") || data.equals("8") || data.equals("9")
				|| data.equals("00")) {
			if ((tf.getText()).equals("0") || (tf.getText()).equals("00"))
				tf.setText(""); // ���� 0�̾ƴ� �ٸ� ���ڸ� ������ �������� �ʱ�ȭ
			val1 = tf.getText() + data; // ���ڸ� �̾ �ٿ���
			tf.setText(val1); // �ش� ���� TextField�� set
		}

		if (data.equals(".")) {
			if ((tf.getText()).equals("0") || (tf.getText()).equals("00"))
				tf.setText("0"); // �Ҽ��� ����� 0�� ù �ڸ��� ���� �� �������� �ʱ�ȭ ��Ű�� ���� ����
			val1 = tf.getText() + data; // ���ڸ� �̾ �ٿ���
			tf.setText(val1); // �ش� ���� TextField�� set
		}

		if (data.equals("+") || data.equals("-") | data.equals("*") | data.equals("/") | data.equals("=")) {
			if (data.equals("+")) { // ���ϱ� ����
				tf.setText("");
				if (val1 != null) {
					val2 = val1;
					val1 = null;
				}
				sign = "+";
			}

			if (data.equals("-")) { // ���� ����
				tf.setText("");
				if (val1 != null) {
					val2 = val1;
					val1 = null;
				}
				sign = "-";
			}

			if (data.equals("*")) { // ���ϱ� ����
				tf.setText("");
				if (val1 != null) {
					val2 = val1;
					val1 = null;
				}
				sign = "*";
			}

			if (data.equals("/")) { // ������ ����
				tf.setText("");
				if (val1 != null) {
					val2 = val1;
					val1 = null;
				}
				sign = "/";
			}

			if (data.equals("=")) { // = ����
				if (sign.equals("+")) // ���ϱ� ���� - �Ҽ��� ����� ���ؼ� Double������ ��ȯ
					result = Double.parseDouble(val2) + Double.parseDouble(val1);

				if (sign.equals("-")) // ���� ���� - �Ҽ��� ����� ���ؼ� Double������ ��ȯ
					result = Double.parseDouble(val2) - Double.parseDouble(val1);

				if (sign.equals("*")) // ���ϱ� ���� - �Ҽ��� ����� ���ؼ� Double������ ��ȯ
					result = Double.parseDouble(val2) * Double.parseDouble(val1);

				if (sign.equals("/")) // ������ ���� - �Ҽ��� ����� ���ؼ� Double������ ��ȯ
					result = Double.parseDouble(val2) / Double.parseDouble(val1);

				tf.setText("");
				// val2 = String.valueOf(result);
				// tf.setText(val2);
				val2 = String.format("%.2f", result); // �Ҽ��� �� 2�ڸ� ������ ���
				tf.setText(val2); // �ش� ���� TextField�� set
				val1 = null;
			}
		}

		if (data.equals("ce")) { // �ι�° �ǿ����ڸ� �ʱ�ȭ
			tf.setText("0");
			val1 = null;
		}

		if (data.equals("c")) { // ���� ��ü�� �ʱ�ȭ
			tf.setText("0");
			val1 = null;
			val2 = null;
			result = 0.0;
		}

		if (data.equals("<-")) { // BackSpace
			val1 = tf.getText();
			char ch[];
			String temp;

			ch = val1.toCharArray(); // val1�� String�� �ǿ����ڸ� �迭�� �޴´�.
			ch[ch.length - 1] = '\n'; // ���� �ֱٿ� �Է¹��� ���ڸ� null������ �ٲ۴�.
			String str = new String(ch);
			temp = str.substring(0, ch.length - 1); // 0������ null�� ������ substring���� �߶� ����
			val1 = temp;
			tf.setText(temp); // �ش� ���� TextField�� set
		}
	}
}