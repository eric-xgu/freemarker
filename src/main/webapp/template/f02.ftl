${msg?string('yes', 'no')}
${date?datetime}
${age}
${tax}

<#--转换为货币-->
${age?string.currency}
${tax?string.percent}
<#--保留位数-->
${tax?string["0.#"]}

${msg1?substring(0,3)}
${msg2?cap_first}
${msg2?uncap_first}
${msg1?capitalize}
${msg1?ends_with("k")?string}

${str1!}
${str2!"数据不存在"}
${(str3??)?c}

<br>
<#--数组,list,set-->
${infos?size}
${infos?first}
${infos?last}

<#list infos as info>
   ${info?index}-${info}<br>
</#list>

<#--list操作-->
<#list list?reverse as list1>
    ${list1?index}-${list1}<br>
</#list>

<#--对象-->
<#list li?sort_by("name") as li1>
    ${li1?index}-${li1.id}-${li1.name}<br>
</#list>

<#--map对象类型-->
<#list maps?keys as key>
    ${key}-${maps[key]}
</#list>


assign定义变量
<#assign str="hello">
${str}<br>
<#assign str1="mzj" str2=["mick","jacksen"]>
${str1}<br>
<#list str2 as st>
    ${st}--<br>
</#list>
<#assign a=60>
<#if a gt 60>
    <h1>the score is no longer enough</h1>
<#elseif a == 60>
    <h1>Long live passing</h1>
</#if>
<#assign list="">
<#if list3??>
    数据存在
<#else >
    数据不存在
</#if>
<#assign user=["aa","bb","cc"]>


<#--定义宏-->
<#macro address>
    1997-2021:copy right by eirc
</#macro>
<#--使用自定义宏-->
<@address></@address>

<#--参数宏-->
<#macro QueryUserbyname name>
    查询user：${name}
</#macro>
<@QueryUserbyname name="admin">

</@QueryUserbyname>

<#--参数宏-->
<#macro miss first seconds>
    查询user：${first}-${seconds}
</#macro>

<@miss first="但愿" seconds="千里">
</@miss>

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

<#--占位符-->
<#macro site>
    <#nested >
    占位符<br>
</#macro>

<@site>
    xxxx
</@site>













