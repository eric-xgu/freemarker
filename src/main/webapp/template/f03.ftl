<#macro cfb>
    <br>
    <#list 1..9 as i>
        <#list 1..i as j>
            ${i}*${j}=${i*j} &nbsp;
        </#list>
        <br>
    </#list>
</#macro>

<@cfb></@cfb>




