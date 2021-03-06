package ru.ifmo.diplom.kirilchuk.jawelet.core.dwt.filters.haar.impl;

import ru.ifmo.diplom.kirilchuk.jawelet.core.dwt.filters.Filter;

/**
 * High reconstruction filter from Haar filter bank. Orthonormalized.
 * 
 * @author Kirilchuk V.E.
 */
public class HaarHighReconstrFilter extends Filter {

	private static final double[] COEFFICIENTS = { 1 / Math.sqrt(2), -1 / Math.sqrt(2) };

	public HaarHighReconstrFilter() {
		super(COEFFICIENTS);
	}
}
