<!DOCTYPE html>
<html>
    <%-- add a body to this head tag to add any meta / common resources --%>
    <theme:head/>
    <theme:body>
        <theme:layoutTemplate name="header"/>
        
        <div class="container">
            <div class="content">
                <div class="page-header">
                    <theme:layoutTitle/>
                </div>
                <div class="span12">
                    <theme:layoutZone name="secondary-navigation"/>
                </div>
                <div class="row">
                    <div class="span9">
                        <theme:layoutZone name="body"/>
                    </div>
<geocities:img/>
                    <div class="span3">
                        <theme:layoutZone name="sidebar"/>
                    </div>
                </div>
            </div>
<geocities:img/>
            <theme:layoutTemplate name="footer"/>
        </div>
    </theme:body>
</html>
