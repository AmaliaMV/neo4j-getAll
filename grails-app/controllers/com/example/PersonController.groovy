package com.example

import grails.compiler.GrailsCompileStatic

//@GrailsCompileStatic
class PersonController {

    ReflectionService reflectionService

    def index() {
        List ids = [1078745649219895296, 1078745649165369344, 1078745649115037696, 1078745649060511744, 1078745649010180096, 1078745648955654144,
                    1078745648905322496, 1078745648854990848, 1078745648800464896, 1078745648750133248, 1078745648699801600, 1078745648645275648,
                    1078745648594944000, 1078745648544612352, 1078745648494280704, 1078745648439754752, 1078745648389423104, 1078745648339091456,
                    1078745648284565504, 1078745648234233856, 1078745648179707904, 1078745648129376256, 1078745648079044608, 1078745648024518656,
                    1078745647974187008, 1078745647923855360, 1078745647869329408, 1078745647818997760, 1078745647768666112, 1078745647718334464,
                    1078745647663808512, 1078745647588311040, 1078745647537979392, 1078745647458287616, 1078745647403761664, 1078745647349235712,
                    1078745647294709760, 1078745647240183808, 1078745647189852160, 1078745647139520512, 1078745647084994560, 1078745647034662912,
                    1078745646980136960, 1078745646925611008, 1078745646875279360, 1078745646824947712, 1078745646774616064, 1078745646720090112,
                    1078745646669758464, 1078745646619426816, 1078745646564900864, 1078745646510374912, 1078745646455848960, 1078745646405517312,
                    1078745646350991360, 1078745646300659712, 1078745646250328064, 1078745646195802112, 1078745646145470464, 1078745646090944512,
                    1078745646040612864, 1078745645990281216, 1078745645939949568, 1078745645889617920, 1078745645839286272, 1078745645784760320,
                    1078745645734428672, 1078745645684097024, 1078745645629571072, 1078745645579239424, 1078745645524713472, 1078745645474381824,
                    1078745645424050176, 1078745645369524224, 1078745645319192576, 1078745645268860928, 1078745645218529280, 1078745645159809024,
                    1078745645109477376, 1078745645059145728, 1078745645008814080, 1078745644954288128, 1078745644903956480, 1078745644853624832,
                    1078745644799098880, 1078745644748767232, 1078745644694241280, 1078745644643909632, 1078745644593577984, 1078745644539052032,
                    1078745644488720384, 1078745644438388736, 1078745644383862784, 1078745644333531136, 1078745644283199488, 1078745644228673536,
                    1078745644169953280, 1078745644090261504, 1078745644039929856, 1078745643985403904, 1078745643935072256, 1078745643880546304,
                    1078745643830214656, 1078745643775688704, 1078745643725357056, 1078745643670831104, 1078745643620499456, 1078745643561779200,
                    1078745643477893120, 1078745643419172864, 1078745643364646912, 1078745643314315264, 1078745643263983616, 1078745643213651968,
                    1078745643163320320, 1078745643104600064, 1078745643050074112, 1078745642995548160, 1078745642936827904, 1078745642878107648,
                    1078745642815193088, 1078745642764861440, 1078745642710335488, 1078745642660003840, 1078745642605477888, 1078745642555146240,
                    1078745642504814592, 1078745642454482944, 1078745642399956992, 1078745642349625344, 1078745642299293696, 1078745642244767744,
                    1078745642194436096, 1078745642139910144, 1078745642089578496, 1078745642035052544, 1078745641984720896, 1078745641930194944,
                    1078745641879863296, 1078745641825337344, 1078745641775005696, 1078745641724674048, 1078745641670148096, 1078745641619816448,
                    1078745641569484800, 1078745641519153152, 1078745641468821504, 1078745641418489856, 1078745641363963904, 1078745641313632256,
                    1078745641259106304, 1078745641204580352, 1078745641154248704, 1078745641099722752, 1078745641049391104, 1078745640999059456,
                    1078745640944533504, 1078745640894201856, 1078745640843870208, 1078745640789344256, 1078745640739012608, 1078745640688680960,
                    1078745640638349312, 1078745640588017664, 1078745640533491712, 1078745640483160064, 1078745640432828416, 1078745640378302464,
                    1078745640319582208, 1078745640269250560, 1078745640214724608, 1078745640164392960, 1078745640114061312, 1078745640063729664,
                    1078745640009203712, 1078745639958872064, 1078745639908540416, 1078745639858208768, 1078745639807877120, 1078745639757545472,
                    1078745639703019520, 1078745639652687872, 1078745639602356224, 1078745639552024576, 1078745639497498624, 1078745639447166976,
                    1078745639396835328, 1078745639342309376, 1078745639291977728, 1078745639241646080, 1078745639187120128, 1078745639136788480,
                    1078745639086456832, 1078745639031930880, 1078745638981599232, 1078745638931267584, 1078745638880935936, 1078745638830604288,
                    1078745638780272640, 1078745638725746688, 1078745638671220736, 1078745638620889088, 1078745638566363136, 1078745638516031488,
                    1078745638461505536, 1078745638411173888, 1078745638360842240, 1078745638310510592, 1078745638235013120, 1078745638159515648,
                    1078745638109184000, 1078745638050463744, 1078745637970771968, 1078745637907857408, 1078745637853331456, 1078745637798805504,
                    1078745637740085248, 1078745637689753600, 1078745637639421952, 1078745637584896000, 1078745637534564352, 1078745637484232704,
                    1078745637433901056, 1078745637383569408, 1078745637329043456, 1078745637278711808, 1078745637203214336, 1078745637144494080,
                    1078745637094162432, 1078745637043830784, 1078745636989304832, 1078745636938973184, 1078745636888641536, 1078745636834115584,
                    1078745636783783936, 1078745636733452288, 1078745636678926336, 1078745636624400384, 1078745636574068736, 1078745636519542784,
                    1078745636465016832, 1078745636414685184, 1078745636364353536, 1078745636314021888, 1078745636263690240, 1078745636213358592,
                    1078745636163026944, 1078745636108500992, 1078745636053975040, 1078745635999449088, 1078745635944923136, 1078745635886202880,
                    1078745635835871232, 1078745635781345280, 1078745635722625024, 1078745635672293376, 1078745635621961728, 1078745635567435776,
                    1078745635517104128, 1078745635466772480, 1078745635416440832, 1078745635366109184, 1078745635315777536, 1078745635261251584,
                    1078745635210919936, 1078745635156393984, 1078745635101868032, 1078745635047342080, 1078745634992816128, 1078745634938290176,
                    1078745634887958528, 1078745634833432576, 1078745634783100928, 1078745634728574976, 1078745634678243328, 1078745634627911680,
                    1078745634577580032, 1078745634523054080, 1078745634472722432, 1078745634418196480, 1078745634367864832, 1078745634313338880,
                    1078745634258812928, 1078745634204286976, 1078745634149761024, 1078745634095235072, 1078745634040709120, 1078745633990377472,
                    1078745633940045824, 1078745633881325568, 1078745633830993920, 1078745633780662272, 1078745633730330624, 1078745633679998976,
                    1078745633629667328, 1078745633554169856, 1078745633499643904, 1078745633424146432, 1078745633373814784, 1078745633294123008,
                    1078745633239597056, 1078745633185071104, 1078745633134739456, 1078745633084407808, 1078745633029881856, 1078745632979550208,
                    1078745632929218560, 1078745632878886912, 1078745632828555264, 1078745632774029312, 1078745632723697664, 1078745632669171712,
                    1078745632618840064, 1078745632564314112, 1078745632513982464, 1078745632463650816, 1078745632409124864, 1078745632358793216,
                    1078745632308461568, 1078745632249741312, 1078745632170049536, 1078745632115523584, 1078745632065191936, 1078745631914196992,
                    1078745631863865344, 1078745631809339392, 1078745631746424832, 1078745631687704576, 1078745631633178624, 1078745631574458368,
                    1078745631524126720, 1078745631469600768, 1078745631415074816, 1078745631364743168, 1078745631314411520, 1078745631259885568,
                    1078745631209553920, 1078745631155027968, 1078745631104696320, 1078745631054364672, 1078745631004033024, 1078745630953701376,
                    1078745630899175424, 1078745630848843776, 1078745630794317824, 1078745630739791872, 1078745630685265920, 1078745630630739968,
                    1078745630580408320, 1078745630525882368, 1078745630475550720, 1078745630425219072, 1078745630370693120, 1078745630316167168,
                    1078745630265835520, 1078745630215503872, 1078745630165172224, 1078745630110646272, 1078745630060314624, 1078745630005788672,
                    1078745629955457024, 1078745629900931072, 1078745629850599424, 1078745629796073472, 1078745629741547520, 1078745629691215872,
                    1078745629636689920, 1078745629586358272, 1078745629536026624, 1078745629481500672, 1078745629431169024, 1078745629380837376,
                    1078745629330505728, 1078745629280174080, 1078745629229842432, 1078745629175316480, 1078745629124984832, 1078745629070458880,
                    1078745629020127232, 1078745628965601280, 1078745628915269632, 1078745628860743680, 1078745628810412032, 1078745628760080384,
                    1078745628705554432, 1078745628655222784, 1078745628604891136, 1078745628550365184, 1078745628500033536, 1078745628449701888,
                    1078745628399370240, 1078745628349038592, 1078745628294512640, 1078745628244180992, 1078745628193849344, 1078745628135129088,
                    1078745628080603136, 1078745628030271488, 1078745627979939840, 1078745627925413888, 1078745627875082240, 1078745627824750592,
                    1078745627770224640, 1078745627719892992, 1078745627669561344, 1078745627619229696, 1078745627568898048, 1078745627514372096,
                    1078745627464040448, 1078745627413708800, 1078745627363377152, 1078745627308851200, 1078745627258519552, 1078745627203993600,
                    1078745627153661952, 1078745627103330304, 1078745627052998656, 1078745626998472704, 1078745626948141056, 1078745626897809408,
                    1078745626847477760, 1078745626797146112, 1078745626746814464, 1078745626692288512, 1078745626641956864, 1078745626591625216,
                    1078745626541293568, 1078745626490961920, 1078745626436435968, 1078745626386104320, 1078745626331578368, 1078745626281246720,
                    1078745626230915072, 1078745626176389120, 1078745626121863168, 1078745626071531520, 1078745626021199872, 1078745625970868224,
                    1078745625920536576, 1078745625866010624, 1078745625815678976, 1078745625765347328, 1078745625715015680, 1078745625656295424,
                    1078745625605963776, 1078745625551437824, 1078745625501106176, 1078745625450774528, 1078745625400442880, 1078745625345916928,
                    1078745625295585280, 1078745625245253632, 1078745625194921984, 1078745625144590336, 1078745625090064384, 1078745625039732736,
                    1078745624989401088, 1078745624939069440, 1078745624888737792, 1078745624838406144, 1078745624788074496, 1078745624737742848,
                    1078745624683216896, 1078745624632885248, 1078745624582553600, 1078745624528027648, 1078745624477696000, 1078745624423170048,
                    1078745624372838400, 1078745624322506752, 1078745624272175104, 1078745624217649152, 1078745624167317504, 1078745624116985856,
                    1078745624066654208, 1078745624012128256, 1078745623961796608, 1078745623911464960, 1078745623856939008, 1078745623806607360,
                    1078745623752081408, 1078745623697555456, 1078745623647223808, 1078745623592697856, 1078745623542366208, 1078745623487840256,
                    1078745623437508608, 1078745623387176960, 1078745623328456704, 1078745623265542144, 1078745623190044672, 1078745623122935808,
                    1078745623072604160, 1078745623022272512, 1078745622967746560, 1078745622917414912, 1078745622867083264, 1078745622812557312,
                    1078745622762225664, 1078745622707699712, 1078744542749917184, 1078744542787665920, 1078744542800248832, 1078744542817026048,
                    1078744542837997568, 1078744542850580480, 1078744542863163392, 1078744542875746304, 1078744542896717824, 1078744542909300736,
                    1078744542917689344, 1078744542930272256, 1078744542942855168, 1078744542955438080, 1078744542968020992, 1078744542988992512,
                    1078744543001575424, 1078744543014158336, 1078744543022546944, 1078744543035129856, 1078744543043518464, 1078744543056101376,
                    1078744543068684288, 1078744543077072896, 1078744543089655808, 1078744543098044416, 1078744543110627328, 1078744543119015936,
                    1078744543131598848, 1078744543139987456, 1078744543148376064, 1078744543160958976, 1078744543173541888, 1078744543181930496,
                    1078744543186124800, 1078744543194513408, 1078744543202902016, 1078744543215484928, 1078744543223873536, 1078744543232262144,
                    1078744543240650752, 1078744543249039360, 1078744543261622272, 1078744543270010880, 1078744543278399488, 1078744543286788096,
                    1078744543295176704, 1078744543307759616, 1078744543316148224, 1078744543328731136, 1078744543337119744, 1078744543345508352,
                    1078744543353896960, 1078744543362285568, 1078744543370674176, 1078744543379062784, 1078744543383257088, 1078744543391645696,
                    1078744543400034304, 1078744543408422912, 1078744543416811520, 1078744543425200128, 1078744543429394432, 1078744543437783040,
                    1078744543441977344, 1078744543450365952, 1078744543458754560, 1078744543467143168, 1078744543475531776, 1078744543483920384,
                    1078744543492308992, 1078744543500697600, 1078744543509086208, 1078744543513280512, 1078744543521669120, 1078744543530057728,
                    1078744543538446336, 1078744543546834944, 1078744543555223552, 1078744543559417856, 1078744543567806464, 1078744543576195072,
                    1078744543584583680, 1078744543588777984, 1078744543597166592, 1078744543609749504, 1078744543618138112, 1078744543622332416,
                    1078744543630721024, 1078744543639109632, 1078744543651692544, 1078744543714607104, 1078744543722995712, 1078744543727190016,
                    1078744543735578624, 1078744543743967232, 1078744543752355840, 1078744543760744448, 1078744543764938752, 1078744543773327360,
                    1078744543777521664, 1078744543781715968, 1078744543790104576, 1078744543798493184, 1078744543806881792, 1078744543811076096,
                    1078744543815270400, 1078744543819464704, 1078744543827853312, 1078744543836241920, 1078744543840436224, 1078744543844630528,
                    1078744543853019136, 1078744543857213440, 1078744543861407744, 1078744543869796352, 1078744543873990656, 1078744543882379264,
                    1078744543886573568, 1078744543894962176, 1078744543899156480, 1078744543903350784, 1078744543911739392, 1078744543915933696,
                    1078744543920128000, 1078744543928516608, 1078744543936905216, 1078744543941099520, 1078744543949488128, 1078744543953682432,
                    1078744543962071040, 1078744543966265344, 1078744543970459648, 1078744543978848256, 1078744543983042560, 1078744543987236864,
                    1078744543991431168, 1078744543999819776, 1078744544004014080, 1078744544008208384, 1078744544012402688, 1078744544020791296,
                    1078744544029179904, 1078744544033374208, 1078744544037568512, 1078744544041762816, 1078744544050151424, 1078744544054345728,
                    1078744544058540032, 1078744544062734336, 1078744544071122944, 1078744544075317248, 1078744544079511552, 1078744544083705856,
                    1078744544092094464, 1078744544096288768, 1078744544100483072, 1078744544104677376, 1078744544108871680, 1078744544117260288,
                    1078744544121454592, 1078744544125648896, 1078744544129843200, 1078744544134037504, 1078744544142426112, 1078744544146620416,
                    1078744544150814720, 1078744544155009024, 1078744544159203328, 1078744544167591936, 1078744544171786240, 1078744544175980544,
                    1078744544180174848, 1078744544188563456, 1078744544192757760, 1078744544196952064, 1078744544201146368, 1078744544205340672,
                    1078744544209534976, 1078744544217923584, 1078744544222117888, 1078744544226312192, 1078744544230506496, 1078744544234700800,
                    1078744544238895104, 1078744544247283712, 1078744544251478016, 1078744544255672320, 1078744544259866624, 1078744544264060928,
                    1078744544272449536, 1078744544276643840, 1078744544285032448, 1078744544289226752, 1078744544293421056, 1078744544297615360,
                    1078744544301809664, 1078744544306003968, 1078744544310198272, 1078744544314392576, 1078744544318586880, 1078744544322781184,
                    1078744544326975488, 1078744544335364096, 1078744544339558400, 1078744544343752704, 1078744544347947008, 1078744544352141312,
                    1078744544356335616, 1078744544360529920, 1078744544364724224, 1078744544373112832, 1078744544377307136, 1078744544381501440,
                    1078744544385695744, 1078744544389890048, 1078744544394084352, 1078744544398278656, 1078744544402472960, 1078744544406667264,
                    1078744544410861568, 1078744544415055872, 1078744544419250176, 1078744544423444480, 1078744544427638784, 1078744544431833088,
                    1078744544436027392, 1078744544444416000, 1078744544448610304, 1078744544452804608, 1078744544461193216, 1078744544465387520,
                    1078744544473776128, 1078744544477970432, 1078744544482164736, 1078744544486359040, 1078744544494747648, 1078744544503136256,
                    1078744544507330560, 1078744544515719168, 1078744544519913472, 1078744544524107776, 1078744544528302080, 1078744544532496384,
                    1078744544536690688, 1078744544540884992, 1078744544549273600, 1078744544553467904, 1078744544557662208, 1078744544566050816,
                    1078744544570245120, 1078744544578633728, 1078744544582828032, 1078744544591216640, 1078744544599605248, 1078744544607993856,
                    1078744544616382464, 1078744544624771072, 1078744544628965376, 1078744544637353984, 1078744544645742592, 1078744544654131200,
                    1078744544658325504, 1078744544662519808, 1078744544666714112, 1078744544670908416, 1078744544675102720, 1078744544679297024,
                    1078744544683491328, 1078744544687685632, 1078744544691879936, 1078744544696074240, 1078744544700268544, 1078744544708657152,
                    1078744544712851456, 1078744544717045760, 1078744544721240064, 1078744544725434368, 1078744544729628672, 1078744544733822976,
                    1078744544738017280, 1078744544742211584, 1078744544750600192, 1078744544754794496, 1078744544758988800, 1078744544763183104,
                    1078744544767377408, 1078744544771571712, 1078744544779960320, 1078744544784154624, 1078744544788348928, 1078744544792543232,
                    1078744544796737536, 1078744544805126144, 1078744544809320448, 1078744544813514752, 1078744544821903360, 1078744544826097664,
                    1078744544830291968, 1078744544834486272, 1078744544838680576, 1078744544847069184, 1078744544851263488, 1078744544855457792,
                    1078744544859652096, 1078744544863846400, 1078744544868040704, 1078744544868040705, 1078744544872235008, 1078744544876429312,
                    1078744544880623616, 1078744544884817920, 1078744544889012224, 1078744544893206528, 1078744544897400832, 1078744544901595136,
                    1078744544905789440, 1078744544909983744, 1078744544914178048, 1078744544922566656, 1078744544926760960, 1078744544930955264,
                    1078744544935149568, 1078744544939343872, 1078744544943538176, 1078744544947732480, 1078744544951926784, 1078744544956121088,
                    1078744544960315392, 1078744544964509696, 1078744544968704000, 1078744544972898304, 1078744544977092608, 1078744544981286912,
                    1078744544985481216, 1078744544985481217, 1078744544989675520, 1078744544993869824, 1078744544998064128, 1078744545002258432,
                    1078744545006452736, 1078744545014841344, 1078744545019035648, 1078744545023229952, 1078744545027424256, 1078744545031618560,
                    1078744545035812864, 1078744545040007168, 1078744545044201472, 1078744545048395776, 1078744545052590080, 1078744545056784384,
                    1078744545060978688, 1078744545065172992, 1078744545069367296, 1078744545073561600, 1078744545077755904, 1078744545081950208,
                    1078744545086144512, 1078744545090338816, 1078744545094533120, 1078744545098727424, 1078744545102921728, 1078744545107116032,
                    1078744545111310336, 1078744545115504640, 1078744545119698944, 1078744545123893248, 1078744545128087552, 1078744545132281856,
                    1078744545136476160, 1078744545136476161, 1078744545140670464, 1078744545144864768, 1078744545149059072, 1078744545153253376,
                    1078744545157447680, 1078744545161641984, 1078744545165836288, 1078744545170030592, 1078744545174224896, 1078744545178419200,
                    1078744545182613504, 1078744545191002112, 1078744545195196416, 1078744545199390720, 1078744545203585024, 1078744545207779328,
                    1078744545211973632, 1078744545216167936, 1078744545220362240, 1078744545224556544, 1078744545228750848, 1078744545232945152,
                    1078744545237139456, 1078744545241333760, 1078744545245528064, 1078744545249722368, 1078744545253916672, 1078744545258110976,
                    1078744545266499584, 1078744545270693888, 1078744545274888192, 1078744545279082496, 1078744545279082497, 1078744545283276800,
                    1078744545287471104, 1078744545291665408, 1078744545295859712, 1078744545300054016, 1078744545304248320, 1078744545308442624,
                    1078744545312636928, 1078744545316831232, 1078744545321025536, 1078744545325219840, 1078744545329414144, 1078744545333608448,
                    1078744545337802752, 1078744545346191360, 1078744545350385664, 1078744545354579968, 1078744545358774272, 1078744545362968576,
                    1078744545367162880, 1078744545371357184, 1078744545375551488, 1078744545379745792, 1078744545383940096, 1078744545388134400,
                    1078744545392328704, 1078744545400717312, 1078744545404911616, 1078744545409105920, 1078744545413300224, 1078744545417494528,
                    1078744545421688832, 1078744545425883136, 1078744545430077440, 1078744545434271744, 1078744545438466048, 1078744545442660352,
                    1078744545446854656, 1078744545451048960, 1078744545459437568, 1078744545463631872, 1078744545467826176, 1078744545472020480,
                    1078744545476214784, 1078744545484603392, 1078744545492992000, 1078744545497186304, 1078744545501380608, 1078744545505574912,
                    1078744545509769216, 1078744545513963520, 1078744545518157824, 1078744545522352128, 1078744545526546432, 1078744545530740736,
                    1078744545534935040, 1078744545543323648, 1078744545547517952, 1078744545551712256, 1078744545555906560, 1078744545560100864,
                    1078744545564295168, 1078744545568489472, 1078744545572683776, 1078744545576878080, 1078744545581072384, 1078744545589460992,
                    1078744545593655296, 1078744545597849600, 1078744545602043904, 1078744545606238208, 1078744545614626816, 1078744545618821120,
                    1078744545623015424, 1078744545631404032, 1078744545635598336, 1078744545639792640, 1078744545643986944, 1078744545648181248,
                    1078744545652375552, 1078744545656569856, 1078744545660764160, 1078744545664958464, 1078744545669152768, 1078744545673347072,
                    1078744545677541376, 1078744545685929984, 1078744545690124288, 1078744545694318592, 1078744545698512896, 1078744545702707200,
                    1078744545706901504, 1078744545711095808, 1078744545715290112, 1078744545719484416]
        List people = reflectionService.getAll(Person, ids).findAll { it != null }

        //List people = Person.getAll([461,462])

        render people: people, size: people.size()
    }


}