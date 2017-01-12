// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SortAlgSelectorPane.java

package io.github.ducduyn31.sorttest.gui.sortalg;

import java.awt.*;
import javax.swing.*;

public class SortAlgSelectorPane extends JScrollPane
{

    public SortAlgSelectorPane()
    {
        setMinimumSize(new Dimension(170, 23));
        setVerticalScrollBarPolicy(22);
        setHorizontalScrollBarPolicy(31);
        JPanel panel = new JPanel();
        setViewportView(panel);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = (new int[] {
            78, 51, 0
        });
        gbl_panel.rowHeights = (new int[] {
            14, 0, 0, 0, 0, 0, 0
        });
        gbl_panel.columnWeights = (new double[] {
            0.0D, 0.0D, 4.9406564584124654E-324D
        });
        gbl_panel.rowWeights = (new double[] {
            0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 4.9406564584124654E-324D
        });
        panel.setLayout(gbl_panel);
        JLabel lblBubbleSort = new JLabel(" Bubble Sort");
        GridBagConstraints gbc_lblBubbleSort = new GridBagConstraints();
        gbc_lblBubbleSort.anchor = 17;
        gbc_lblBubbleSort.insets = new Insets(0, 0, 5, 5);
        gbc_lblBubbleSort.gridx = 0;
        gbc_lblBubbleSort.gridy = 0;
        panel.add(lblBubbleSort, gbc_lblBubbleSort);
        JRadioButton bsradioButton = new JRadioButton("");
        GridBagConstraints gbc_bsradioButton = new GridBagConstraints();
        gbc_bsradioButton.insets = new Insets(0, 0, 5, 0);
        gbc_bsradioButton.gridx = 1;
        gbc_bsradioButton.gridy = 0;
        panel.add(bsradioButton, gbc_bsradioButton);
        JLabel lblSelectionSort = new JLabel(" Selection Sort");
        GridBagConstraints gbc_lblSelectionSort = new GridBagConstraints();
        gbc_lblSelectionSort.anchor = 17;
        gbc_lblSelectionSort.insets = new Insets(0, 0, 5, 5);
        gbc_lblSelectionSort.gridx = 0;
        gbc_lblSelectionSort.gridy = 1;
        panel.add(lblSelectionSort, gbc_lblSelectionSort);
        JRadioButton ssradioButton = new JRadioButton("");
        GridBagConstraints gbc_ssradioButton = new GridBagConstraints();
        gbc_ssradioButton.insets = new Insets(0, 0, 5, 0);
        gbc_ssradioButton.gridx = 1;
        gbc_ssradioButton.gridy = 1;
        panel.add(ssradioButton, gbc_ssradioButton);
        JLabel lblInsertionSort = new JLabel(" Insertion Sort");
        GridBagConstraints gbc_lblInsertionSort = new GridBagConstraints();
        gbc_lblInsertionSort.anchor = 17;
        gbc_lblInsertionSort.insets = new Insets(0, 0, 5, 5);
        gbc_lblInsertionSort.gridx = 0;
        gbc_lblInsertionSort.gridy = 2;
        panel.add(lblInsertionSort, gbc_lblInsertionSort);
        JRadioButton isradioButton = new JRadioButton("");
        GridBagConstraints gbc_isradioButton = new GridBagConstraints();
        gbc_isradioButton.insets = new Insets(0, 0, 5, 0);
        gbc_isradioButton.gridx = 1;
        gbc_isradioButton.gridy = 2;
        panel.add(isradioButton, gbc_isradioButton);
        JLabel lblHeapSort = new JLabel(" Heap Sort");
        GridBagConstraints gbc_lblHeapSort = new GridBagConstraints();
        gbc_lblHeapSort.anchor = 17;
        gbc_lblHeapSort.insets = new Insets(0, 0, 5, 5);
        gbc_lblHeapSort.gridx = 0;
        gbc_lblHeapSort.gridy = 3;
        panel.add(lblHeapSort, gbc_lblHeapSort);
        JRadioButton hsradioButton = new JRadioButton("");
        GridBagConstraints gbc_hsradioButton = new GridBagConstraints();
        gbc_hsradioButton.insets = new Insets(0, 0, 5, 0);
        gbc_hsradioButton.gridx = 1;
        gbc_hsradioButton.gridy = 3;
        panel.add(hsradioButton, gbc_hsradioButton);
        JLabel lblMergeSort = new JLabel(" Merge Sort");
        GridBagConstraints gbc_lblMergeSort = new GridBagConstraints();
        gbc_lblMergeSort.anchor = 17;
        gbc_lblMergeSort.insets = new Insets(0, 0, 5, 5);
        gbc_lblMergeSort.gridx = 0;
        gbc_lblMergeSort.gridy = 4;
        panel.add(lblMergeSort, gbc_lblMergeSort);
        JRadioButton msradioButton = new JRadioButton("");
        GridBagConstraints gbc_msradioButton = new GridBagConstraints();
        gbc_msradioButton.insets = new Insets(0, 0, 5, 0);
        gbc_msradioButton.gridx = 1;
        gbc_msradioButton.gridy = 4;
        panel.add(msradioButton, gbc_msradioButton);
        JLabel lblQuickSort = new JLabel(" Quick Sort");
        GridBagConstraints gbc_lblQuickSort = new GridBagConstraints();
        gbc_lblQuickSort.anchor = 17;
        gbc_lblQuickSort.insets = new Insets(0, 0, 0, 5);
        gbc_lblQuickSort.gridx = 0;
        gbc_lblQuickSort.gridy = 5;
        panel.add(lblQuickSort, gbc_lblQuickSort);
        JRadioButton qsradioButton = new JRadioButton("");
        GridBagConstraints gbc_qsradioButton = new GridBagConstraints();
        gbc_qsradioButton.gridx = 1;
        gbc_qsradioButton.gridy = 5;
        panel.add(qsradioButton, gbc_qsradioButton);
    }
}
