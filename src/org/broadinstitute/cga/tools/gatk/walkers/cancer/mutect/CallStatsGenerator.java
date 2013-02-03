/*
 * By downloading the PROGRAM you agree to the following terms of use:
 *
 * BROAD INSTITUTE SOFTWARE LICENSE AGREEMENT
 * FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
 *
 * This Agreement is made between the Broad Institute, Inc. with a principal address at 7 Cambridge Center, Cambridge, MA 02142 ("BROAD") and the LICENSEE and is effective at the date the downloading is completed ("EFFECTIVE DATE").
 * WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
 * WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
 * NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
 *
 * 1. DEFINITIONS
 * 1.1	"PROGRAM" shall mean copyright in the object code and source code known as MuTect and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute.or/cancer/cga/mutect on the EFFECTIVE DATE.
 *
 * 2. LICENSE
 * 2.1   Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM.
 * LICENSEE hereby automatically grants to BROAD a non-exclusive, royalty-free, irrevocable license to any LICENSEE bug fixes or modifications to the PROGRAM with unlimited rights to sublicense and/or distribute.  LICENSEE agrees to provide any such modifications and bug fixes to BROAD promptly upon their creation.
 * The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only.  For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
 * 2.2  No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD.  LICENSEE shall ensure that all of its users agree to the terms of this Agreement.  LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
 * 2.3  License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.
 *
 * 3. OWNERSHIP OF INTELLECTUAL PROPERTY
 * LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies.  LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
 *
 * Copyright © 2012 Broad Institute, Inc.
 * Notice of attribution:  The MuTect program was made available through the generosity of the Cancer Genome Analysis group at the Broad Institute, Inc. and is published at doi: 10.1038/nbt.2514.
 *
 * LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
 *
 * 4. INDEMNIFICATION
 * LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, ("Indemnitees"), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
 *
 * 5. NO REPRESENTATIONS OR WARRANTIES
 * THE PROGRAM IS DELIVERED "AS IS."  BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
 * IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
 *
 * 6. ASSIGNMENT
 * This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
 *
 * 7. MISCELLANEOUS
 * 7.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
 * 7.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
 * 7.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
 * 7.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested.  All notices under this Agreement shall be deemed effective upon receipt.
 * 7.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter.
 * 7.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
 * 7.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
 */

package org.broadinstitute.cga.tools.gatk.walkers.cancer.mutect;

import net.sf.picard.util.FormatUtil;
import net.sf.samtools.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 *  Encapsulates the generation of a CallStats line based on the information in the Candidate
 */
public class CallStatsGenerator {
    private static final String TAB = "\t";
    private final FormatUtil fmt = new FormatUtil();

    private int[] minimalHeaderIndicies;

    private static final String[] COMPLETE_CALL_STATS_HEADER =
            new String[]{
                    "contig","position","context","ref_allele","alt_allele","tumor_name","normal_name","score","dbsnp_site",
                    "covered", "power", "tumor_power", "normal_power", "normal_power_nsp", "normal_power_wsp",
                    "total_pairs","improper_pairs","map_Q0_reads",
                    "init_t_lod","t_lod_fstar", "t_lod_fstar_forward", "t_lod_fstar_reverse", "tumor_f", "contaminant_fraction","contaminant_lod","t_q20_count", "t_ref_count","t_alt_count","t_ref_sum","t_alt_sum","t_ref_max_mapq","t_alt_max_mapq","t_ins_count","t_del_count",
                    "normal_best_gt","init_n_lod","normal_f",
                    "n_q20_count", "n_ref_count","n_alt_count","n_ref_sum","n_alt_sum",
                    "power_to_detect_positive_strand_artifact", "power_to_detect_negative_strand_artifact",
                    "strand_bias_counts",
                    "tumor_alt_fpir_median", "tumor_alt_fpir_mad","tumor_alt_rpir_median","tumor_alt_rpir_mad",
                    "observed_in_normals_count", "failure_reasons","judgement"
            };

    private static final String[] MINIMAL_CALL_STATS_HEADER =
            new String[]{
                    "contig","position","context","ref_allele","alt_allele","tumor_name","normal_name","score","dbsnp_site",
                    "covered", "power", "tumor_power", "normal_power",
                    "total_pairs","improper_pairs","map_Q0_reads",
                    "t_lod_fstar","tumor_f","contaminant_fraction","contaminant_lod",
                    "t_ref_count","t_alt_count","t_ref_sum","t_alt_sum","t_ref_max_mapq","t_alt_max_mapq","t_ins_count","t_del_count",
                    "normal_best_gt","init_n_lod", "n_ref_count","n_alt_count","n_ref_sum","n_alt_sum",
                    "observed_in_normals_count", "failure_reasons","judgement"
            };

    private boolean enableExtendedOutput;

    public CallStatsGenerator(boolean enableExtendedOutput) {
        this.enableExtendedOutput = enableExtendedOutput;
    }

    public String generateHeader() {
        String header;
        if (this.enableExtendedOutput) {
            header = StringUtil.join(TAB, COMPLETE_CALL_STATS_HEADER);
        } else {
            header = StringUtil.join(TAB, MINIMAL_CALL_STATS_HEADER);

            // initialize the indicies of the reduced headers from the full headers
            minimalHeaderIndicies = new int[MINIMAL_CALL_STATS_HEADER.length];
            for(int i=0; i<MINIMAL_CALL_STATS_HEADER.length; i++) {
                String column = MINIMAL_CALL_STATS_HEADER[i];

                for(int j=0; j<COMPLETE_CALL_STATS_HEADER.length; j++) {
                    if (COMPLETE_CALL_STATS_HEADER[j].equals(column)) {
                        minimalHeaderIndicies[i] = j;
                    }
                }
            }

        }
        return header;
    }

    public String generateCallStats(CandidateMutation candidate) {
        String keepString = "REJECT";
        if (!candidate.isRejected()) {
            keepString = "KEEP";
        }

        String siteInfo = "NOVEL";
        if (candidate.isDbsnpSite()) {
            siteInfo = "DBSNP";
        }
        if (candidate.isCosmicSite()) {
            siteInfo = "COSMIC";
        }
        if (candidate.isDbsnpSite() && candidate.isCosmicSite()) {
            siteInfo = "DBSNP+COSMIC";
        }

        StringBuilder sb = new StringBuilder();
        int[] ci = candidate.getStrandContingencyTable();
        sb.append("(");
        sb.append(ci[0]).append(",");
        sb.append(ci[1]).append(",");
        sb.append(ci[2]).append(",");
        sb.append(ci[3]).append(")");
        String strandInfo = sb.toString();

        String[] msg = new String[] {
                candidate.getLocation().getContig(),
                format(candidate.getLocation().getStart()),
                candidate.getSequenceContext(),
                ""+candidate.getRefAllele(),
                ""+candidate.getAltAllele(),
                candidate.getTumorSampleName(),
                candidate.getNormalSampleName(),
                format(candidate.getScore()),
                siteInfo,
                (candidate.isCovered()?"COVERED":"UNCOVERED"),
                format(candidate.getPower()),
                format(candidate.getTumorPower()),
                format(candidate.getNormalPower()),
                format(candidate.getNormalPowerNoSNPPrior()),
                format(candidate.getNormalPowerWithSNPPrior()),
                format(candidate.getTotalPairs()),
                format(candidate.getImproperPairs()),
                format(candidate.getMapQ0Reads()),
                format(candidate.getInitialTumorLod()),
                format(candidate.getTumorLodFStar()),
                format(candidate.getTumorLodFStarForward()),
                format(candidate.getTumorLodFStarReverse()),
                format(candidate.getTumorF()),
                format(candidate.getContaminationFraction()),
                format(candidate.getContaminantLod()),
                format(candidate.getTumorQ20Count()),
                format(candidate.getInitialTumorRefCounts()),
                format(candidate.getInitialTumorAltCounts()),
                format(candidate.getInitialTumorRefQualitySum()),
                format(candidate.getInitialTumorAltQualitySum()),
                format(candidate.getTumorRefMaxMapQ()),
                format(candidate.getTumorAltMaxMapQ()),
                format(candidate.getTumorInsertionCount()),
                format(candidate.getTumorDeletionCount()),
                format(candidate.getInitialNormalBestGenotype().toString()),
                format(candidate.getInitialNormalLod()),
                format(candidate.getNormalF()),
                format(candidate.getNormalQ20Count()),
                format(candidate.getInitialNormalRefCounts()),
                format(candidate.getInitialNormalAltCounts()),
                format(candidate.getInitialNormalRefQualitySum()),
                format(candidate.getInitialNormalAltQualitySum()),
                format(candidate.getPowerToDetectPositiveStrandArtifact()),
                format(candidate.getPowerToDetectNegativeStrandArtifact()),
                format(strandInfo),
                candidate.getTumorForwardOffsetsInReadMedian()==null?"n/a":format(candidate.getTumorForwardOffsetsInReadMedian()),
                candidate.getTumorForwardOffsetsInReadMad()==null?"n/a":format(candidate.getTumorForwardOffsetsInReadMad()),
                candidate.getTumorReverseOffsetsInReadMedian()==null?"n/a":format(candidate.getTumorReverseOffsetsInReadMedian()),
                candidate.getTumorReverseOffsetsInReadMad()==null?"n/a":format(candidate.getTumorReverseOffsetsInReadMad()),
                format(candidate.getCountOfNormalsObservedIn()),
                StringUtil.join(",", candidate.getRejectionReasons().toArray(new String[candidate.getRejectionReasons().size()])),
                keepString
        };

        if (this.enableExtendedOutput) {
            for(int i=0; i<msg.length; i++) {
                if (msg[i]==null) { System.out.println("ERROR: found null in output at position " + i); }
            }
            return StringUtil.join(TAB, msg);
        } else {
            List<String> output = new ArrayList<String>();
            for(int index : minimalHeaderIndicies) {
                output.add(msg[index]);
            }
            return StringUtil.join(TAB, output);
        }
    }

    private String format(String s) { return s; }
    private String format(Integer i) { return fmt.format(i); }
    private String format(Double d) {
        if (d == null) { return "n/a"; }

        String s = fmt.format(d);
        return ("-0".equals(s))?"0":s;
    }
}
