/**
 * This file is part of mycollab-mobile.
 *
 * mycollab-mobile is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-mobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-mobile.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.mobile.module.crm.view.contact;

import com.esofthead.mycollab.mobile.module.crm.ui.AbstractRelatedListView;
import com.esofthead.mycollab.mobile.module.crm.view.activity.ActivityListDisplay;
import com.esofthead.mycollab.module.crm.domain.SimpleActivity;
import com.esofthead.mycollab.module.crm.domain.criteria.ActivitySearchCriteria;

/**
 * 
 * @author MyCollab Ltd.
 * @since 4.0
 * 
 */
public class ContactRelatedActivityView extends
		AbstractRelatedListView<SimpleActivity, ActivitySearchCriteria> {
	private static final long serialVersionUID = 2770865938392595111L;

	public ContactRelatedActivityView() {
		initUI();
	}

	private void initUI() {
		this.setCaption("Related Activities");
		tableItem = new ActivityListDisplay("subject");
		this.setContent(tableItem);
	}

	@Override
	public void refresh() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}