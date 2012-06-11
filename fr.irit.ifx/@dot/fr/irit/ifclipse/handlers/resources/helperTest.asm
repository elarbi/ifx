<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="getChildren_HTest"/>
		<constant value="instanceTypeSeq"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="Sequence"/>
		<constant value="#native"/>
		<constant value="Instance"/>
		<constant value="IFConfig"/>
		<constant value="J.allInstances():J"/>
		<constant value="1"/>
		<constant value="type"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="u2i"/>
		<constant value="J.startsWith(J):J"/>
		<constant value="J.not():J"/>
		<constant value="B.not():B"/>
		<constant value="27"/>
		<constant value="Default_System"/>
		<constant value="Default_Server"/>
		<constant value="Default_Server_server4client_Port"/>
		<constant value="Default_Client"/>
		<constant value=""/>
		<constant value="J.debug(J):J"/>
		<constant value="J.assertEqual(JJ):J"/>
		<constant value="14:2-14:19"/>
		<constant value="14:2-14:34"/>
		<constant value="15:17-15:18"/>
		<constant value="15:17-15:23"/>
		<constant value="14:2-15:24"/>
		<constant value="16:20-16:21"/>
		<constant value="16:33-16:38"/>
		<constant value="16:20-16:39"/>
		<constant value="16:16-16:39"/>
		<constant value="14:2-16:40"/>
		<constant value="4:2-4:12"/>
		<constant value="5:3-5:13"/>
		<constant value="5:3-5:29"/>
		<constant value="6:13-6:29"/>
		<constant value="6:31-6:47"/>
		<constant value="6:49-6:84"/>
		<constant value="6:86-6:102"/>
		<constant value="6:3-6:103"/>
		<constant value="6:110-6:112"/>
		<constant value="6:3-6:113"/>
		<constant value="4:2-7:3"/>
		<constant value="7:10-7:12"/>
		<constant value="4:2-7:13"/>
		<constant value="i"/>
		<constant value="t"/>
		<constant value="self"/>
		<constant value="assertEqual"/>
		<constant value="2"/>
		<constant value="OclParametrizedType"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="J.oclIsTypeOf(J):J"/>
		<constant value="16"/>
		<constant value="20"/>
		<constant value="J.assertEqualSeq(JJ):J"/>
		<constant value="20:5-20:6"/>
		<constant value="20:28-20:34"/>
		<constant value="20:19-20:35"/>
		<constant value="20:5-20:36"/>
		<constant value="22:7-22:12"/>
		<constant value="21:7-21:17"/>
		<constant value="21:33-21:34"/>
		<constant value="21:35-21:36"/>
		<constant value="21:7-21:37"/>
		<constant value="20:2-23:7"/>
		<constant value="a"/>
		<constant value="b"/>
		<constant value="assertEqualSeq"/>
		<constant value="27:2-27:6"/>
	</cp>
	<field name="1" type="2"/>
	<operation name="3">
		<context type="4"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="5"/>
			<push arg="6"/>
			<new/>
			<push arg="5"/>
			<push arg="6"/>
			<new/>
			<push arg="7"/>
			<push arg="8"/>
			<findme/>
			<call arg="9"/>
			<iterate/>
			<store arg="10"/>
			<load arg="10"/>
			<get arg="11"/>
			<call arg="12"/>
			<enditerate/>
			<iterate/>
			<store arg="10"/>
			<load arg="10"/>
			<push arg="13"/>
			<call arg="14"/>
			<call arg="15"/>
			<call arg="16"/>
			<if arg="17"/>
			<load arg="10"/>
			<call arg="12"/>
			<enditerate/>
			<set arg="1"/>
			<getasm/>
			<getasm/>
			<get arg="1"/>
			<push arg="5"/>
			<push arg="6"/>
			<new/>
			<push arg="18"/>
			<call arg="12"/>
			<push arg="19"/>
			<call arg="12"/>
			<push arg="20"/>
			<call arg="12"/>
			<push arg="21"/>
			<call arg="12"/>
			<push arg="22"/>
			<call arg="23"/>
			<call arg="24"/>
			<push arg="22"/>
			<call arg="23"/>
		</code>
		<linenumbertable>
			<lne id="25" begin="7" end="9"/>
			<lne id="26" begin="7" end="10"/>
			<lne id="27" begin="13" end="13"/>
			<lne id="28" begin="13" end="14"/>
			<lne id="29" begin="4" end="16"/>
			<lne id="30" begin="19" end="19"/>
			<lne id="31" begin="20" end="20"/>
			<lne id="32" begin="19" end="21"/>
			<lne id="33" begin="19" end="22"/>
			<lne id="34" begin="1" end="27"/>
			<lne id="35" begin="29" end="29"/>
			<lne id="36" begin="30" end="30"/>
			<lne id="37" begin="30" end="31"/>
			<lne id="38" begin="35" end="35"/>
			<lne id="39" begin="37" end="37"/>
			<lne id="40" begin="39" end="39"/>
			<lne id="41" begin="41" end="41"/>
			<lne id="42" begin="32" end="42"/>
			<lne id="43" begin="43" end="43"/>
			<lne id="44" begin="32" end="44"/>
			<lne id="45" begin="29" end="45"/>
			<lne id="46" begin="46" end="46"/>
			<lne id="47" begin="29" end="47"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="48" begin="12" end="15"/>
			<lve slot="1" name="49" begin="18" end="26"/>
			<lve slot="0" name="50" begin="0" end="47"/>
		</localvariabletable>
	</operation>
	<operation name="51">
		<context type="4"/>
		<parameters>
			<parameter name="10" type="2"/>
			<parameter name="52" type="2"/>
		</parameters>
		<code>
			<load arg="10"/>
			<push arg="53"/>
			<push arg="6"/>
			<new/>
			<dup/>
			<push arg="5"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="55"/>
			<push arg="6"/>
			<findme/>
			<pcall arg="56"/>
			<call arg="57"/>
			<if arg="58"/>
			<pushf/>
			<goto arg="59"/>
			<getasm/>
			<load arg="10"/>
			<load arg="52"/>
			<call arg="60"/>
		</code>
		<linenumbertable>
			<lne id="61" begin="0" end="0"/>
			<lne id="62" begin="8" end="10"/>
			<lne id="63" begin="1" end="11"/>
			<lne id="64" begin="0" end="12"/>
			<lne id="65" begin="14" end="14"/>
			<lne id="66" begin="16" end="16"/>
			<lne id="67" begin="17" end="17"/>
			<lne id="68" begin="18" end="18"/>
			<lne id="69" begin="16" end="19"/>
			<lne id="70" begin="0" end="19"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="50" begin="0" end="19"/>
			<lve slot="1" name="71" begin="0" end="19"/>
			<lve slot="2" name="72" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="73">
		<context type="4"/>
		<parameters>
			<parameter name="10" type="2"/>
			<parameter name="52" type="2"/>
		</parameters>
		<code>
			<pusht/>
		</code>
		<linenumbertable>
			<lne id="74" begin="0" end="0"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="50" begin="0" end="0"/>
			<lve slot="1" name="71" begin="0" end="0"/>
			<lve slot="2" name="72" begin="0" end="0"/>
		</localvariabletable>
	</operation>
</asm>
