<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph edgemode="directed" edgeids="false" role="graph" id="mergeAcrossNesting-2">
        <attr name="$version">
            <string>curly</string>
        </attr>
        <attr name="$version">
            <string>curly</string>
        </attr>
        <node id="n3">
            <attr name="layout">
                <string>128 188 34 46</string>
            </attr>
        </node>
        <node id="n0">
            <attr name="layout">
                <string>127 85 34 61</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>229 173 34 61</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>232 72 34 61</string>
            </attr>
        </node>
        <edge to="n0" from="n0">
            <attr name="label">
                <string>flag:a</string>
            </attr>
        </edge>
        <edge to="n0" from="n0">
            <attr name="label">
                <string>type:A</string>
            </attr>
        </edge>
        <edge to="n2" from="n2">
            <attr name="label">
                <string>type:B</string>
            </attr>
        </edge>
        <edge to="n1" from="n1">
            <attr name="label">
                <string>type:B</string>
            </attr>
        </edge>
        <edge to="n3" from="n3">
            <attr name="label">
                <string>type:C</string>
            </attr>
        </edge>
        <edge to="n2" from="n2">
            <attr name="label">
                <string>flag:b2</string>
            </attr>
        </edge>
        <edge to="n3" from="n0">
            <attr name="label">
                <string>c</string>
            </attr>
        </edge>
        <edge to="n1" from="n1">
            <attr name="label">
                <string>flag:b1</string>
            </attr>
        </edge>
    </graph>
</gxl>
