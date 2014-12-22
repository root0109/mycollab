/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_crm_campaigns_leads*/
package com.esofthead.mycollab.module.crm.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("m_crm_campaigns_leads")
public class CampaignLead extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_campaigns_leads.id
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_campaigns_leads.campaignId
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("campaignId")
    private Integer campaignid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_campaigns_leads.leadId
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("leadId")
    private Integer leadid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_crm_campaigns_leads.createdTime
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("createdTime")
    private Date createdtime;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_campaigns_leads.id
     *
     * @return the value of m_crm_campaigns_leads.id
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_campaigns_leads.id
     *
     * @param id the value for m_crm_campaigns_leads.id
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_campaigns_leads.campaignId
     *
     * @return the value of m_crm_campaigns_leads.campaignId
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    public Integer getCampaignid() {
        return campaignid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_campaigns_leads.campaignId
     *
     * @param campaignid the value for m_crm_campaigns_leads.campaignId
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    public void setCampaignid(Integer campaignid) {
        this.campaignid = campaignid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_campaigns_leads.leadId
     *
     * @return the value of m_crm_campaigns_leads.leadId
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    public Integer getLeadid() {
        return leadid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_campaigns_leads.leadId
     *
     * @param leadid the value for m_crm_campaigns_leads.leadId
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    public void setLeadid(Integer leadid) {
        this.leadid = leadid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_crm_campaigns_leads.createdTime
     *
     * @return the value of m_crm_campaigns_leads.createdTime
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_crm_campaigns_leads.createdTime
     *
     * @param createdtime the value for m_crm_campaigns_leads.createdTime
     *
     * @mbggenerated Mon Dec 22 11:25:10 ICT 2014
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public static enum Field {
        id,
        campaignid,
        leadid,
        createdtime;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}