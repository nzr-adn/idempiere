/******************************************************************************
 * Copyright (C) 2009 Low Heng Sin                                            *
 * Copyright (C) 2009 Idalica Corporation                                     *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.adempiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.X_M_PromotionDistribution;

/**
 * Extended model class for M_PromotionDistribution
 * @author hengsin
 */
public class MPromotionDistribution extends X_M_PromotionDistribution {

	private static final long serialVersionUID = 1532619121257280486L;

    /**
     * UUID based Constructor
     * @param ctx  Context
     * @param M_PromotionDistribution_UU  UUID key
     * @param trxName Transaction
     */
    public MPromotionDistribution(Properties ctx, String M_PromotionDistribution_UU, String trxName) {
        super(ctx, M_PromotionDistribution_UU, trxName);
    }

    /**
     * @param ctx
     * @param M_PromotionDistribution_ID
     * @param trxName
     */
	public MPromotionDistribution(Properties ctx, int M_PromotionDistribution_ID, String trxName) {
		super(ctx, M_PromotionDistribution_ID, trxName);
	}

	/**
	 * @param ctx
	 * @param rs
	 * @param trxName
	 */
	public MPromotionDistribution(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	/**
	 * @param ctx
	 * @param M_PromotionDistribution_ID
	 * @param trxName
	 * @param virtualColumns
	 */
	public MPromotionDistribution(Properties ctx, int M_PromotionDistribution_ID, String trxName,
			String... virtualColumns) {
		super(ctx, M_PromotionDistribution_ID, trxName, virtualColumns);
	}

}
