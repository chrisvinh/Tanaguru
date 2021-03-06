/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2011  Open-S Company
 *
 * This file is part of Tanaguru.
 *
 * Tanaguru is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: open-s AT open-s DOT com
 */
package org.opens.tanaguru.crawler;

import java.util.Collection;
import org.opens.tanaguru.entity.factory.audit.ContentFactory;
import org.opens.tanaguru.entity.service.audit.ContentDataService;
import org.opens.tanaguru.entity.service.subject.WebResourceDataService;
import org.opens.tanaguru.entity.subject.WebResource;
import org.opens.tanaguru.parameterization.Parametrable;

/**
 * 
 * @author jkowalczyk
 */
public interface Crawler extends Parametrable {

    /**
     * 
     * @return
     *          the crawled webresource
     */
    WebResource getResult();

    /**
     * 
     */
    void run();

    /**
     *
     * @param webResourceURL
     */
    void setSiteURL(String webResourceURL);

    /**
     *
     * @param siteName
     * @param webResourceURL
     */
    void setSiteURL(String siteName, Collection<String> webResourceURL);

    /**
     *
     * @param pageURL
     */
    void setPageURL(String pageURL);


    /**
     *
     * @param contentFactory
     */
    void setContentFactory(ContentFactory contentFactory);

    /**
     *
     * @param contentDataService
     */
    void setContentDataService(ContentDataService contentDataService);

    /**
     *
     * @param webResourceDataService
     */
    void setWebResourceDataService(WebResourceDataService webResourceDataService);

    /**
     *
     * @param outputDir
     */
    void setOutputDir(String outputDir);

    /**
     * 
     * @param crawlConfigFilePath
     */
    void setCrawlConfigFilePath(String crawlConfigFilePath);
    
    /**
     * 
     * @param persistOnTheFly
     */
    void setPersistOnTheFly(boolean persistOnTheFly);
    
}